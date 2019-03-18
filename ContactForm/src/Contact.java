public class Contact {
    Integer id;
    String fullName;
    String address;
    Integer phoneNumber;
    public Contact(Integer id, String fullName, Integer phoneNumber, String address)
    {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;

    }



    public void setId(Integer input) {
        this.id = input;
    }
    public Integer getId() {
        return id;
    }

    public void setFullName(String input){
        this.fullName = input;
    }
    public String getFullName(){
        return fullName;
    }
    public void setAddress(String input){
        this.address = input;
    }
    public String getAddress(){
        return address;
    }
    public void setPhoneNumber(Integer input){
        this.phoneNumber = input;

    }
    public Integer getPhoneNumber(){
        return phoneNumber;
    }

    public void displayContact(){
        System.out.println(" Full Name: " + fullName);
    }

    @Override
    public String toString() {
        return "ID "+ id + " Full Name: " + fullName + ", Phone Number: " + phoneNumber + ". Address: " + address;
    }

}
