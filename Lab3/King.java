public class King extends ChessPiece {

    private static int importance = 1000;

    public King() {
        super(importance);
    }

    @Override
    public String toString() {
        return "King {value = " + getValue() + "}";
    }

    @Override
    public void move() {
        System.out.println("King moves one square");
    }

}