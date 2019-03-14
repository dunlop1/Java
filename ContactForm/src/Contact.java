public abstract class Contact {

    String fullName;
    String address;
    String phoneNumber;
    String emailAddress;

    public Contact(String fullName, String address, String phoneNumber, String emailAddress)
    {
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
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

    public void setPhoneNumber(String input){
        this.phoneNumber = input;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setEmailAddress(String input){
        this.emailAddress = input;
    }
    public String getEmailAddress(){
        return emailAddress;
    }

    void viewContacts(){
        System.out.println("First Name:" + fullName);
        System.out.println("Address:" + address);
        System.out.println("Phone Number:" + phoneNumber);
        System.out.println("Email Address:" + emailAddress);
    }

}
