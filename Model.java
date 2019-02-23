public class Model {
    static String occupation = "modeling";
    private String fName;
    private String lName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;



    public Model(String susan, String smith, int i, int i1, boolean b, boolean b1) {

    }


    public Model(String fName, String lName, int height, double weightKg, boolean canTravel, boolean smokes, String occupation) {
        setFName(fName);
        setLName(lName);
        setHeight(height);
        setweight(weightKg);
        setCanTravel(canTravel);
        setsmokes(smokes);
    }


    public Model(String fName, String lName, int height, double weight){
        setFName(fName);
        setLName(lName);
        setHeight(height);
        setweight(weight);
        setCanTravel(true);
        setsmokes(false);

    }
    public static String getOccupation() {
        return occupation;
    }


    public String getFname() {
        // getter for name
        return this.fName;
    }
    public String getLname() {
        // getter for name
        return this.lName;

    }
    public int getHeight() {
        return height;
    }
    public String getHeightInFeetAndInches() {
        int feet = height / 12;
        int inches = height % 12;

        String fUnit = "";
        if (feet > 1) {
            fUnit = feet + " feet";
        } else if (feet == 1) {
            fUnit = feet + " foot";
        }

        String iUnit = "";
        if (inches > 1) {
            iUnit = inches + " inches";
        } else if (inches == 1) {
            iUnit = inches + " inch";
        }

        return fUnit + iUnit;
    }

    public double getWeight() {
        return weight;
    }

    public long getWeightKg() {
        return Math.round(weight * 0.45);
    }

    public boolean isCanTravel() {
        return canTravel;
    }

    public boolean isSmokes() {
        return smokes;
    }

    public final void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    public final void setFName(String fName) {
        if ((fName != null) && (fName.length() >= 3) && (fName.length() <= 20)) {
            this.fName = fName;
        }
    }

    public final void setLName(String lName) {
        if ((lName != null) && (lName.length() >= 3) && (lName.length() <= 20)) {
            this.lName = lName;
        }
    }

    public final void setHeight(int inches) {
        if (inches >= 24 && inches <= 84) {
            this.height = inches;
        }
    }

    public final void setHeight(int feet, int inches) {
        int inInches = feet * 12 + inches;
        setHeight(inInches);
    }

    public final void setweight(double pounds) {
        if (pounds >= 80 && pounds <= 280) {
            this.weight = pounds;
        }
    }

    public final void setWeight(long kilograms) {
        double inPounds = kilograms * 2.205;
        setweight(inPounds);
    }

    public void setsmokes(boolean smokes) {
        this.smokes = smokes;
    }

    public void printDetails() {
        System.out.println("Name: " + getFname() + " " + getLname());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        if (canTravel) {
            System.out.println("Does travel ");
        } else {
            System.out.println("Does not travel ");
        }

        if (smokes) {
            System.out.println("Does smoke ");
        } else {
            System.out.println("Does not smoke ");
        }
    }



}
