/**
 * Created by eugene on 2019-03-12.
 */
public class Contact {
    int contactId;
    String fullName;
    String address;
    String phoneNumber;
    String emailAddress;
    public Contact(int contactId,String fullName, String address, String phoneNumber, String emailAddress)
    {
        this.contactId = contactId;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    public void setContactId(){
        this.contactId = contactId;
    }
    public int getContactId(){
        return contactId;
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
    public void displayContact(){
        System.out.println("Contact Id: " + contactId + " First Name: " + fullName);
    }

    @Override
    public String toString() {
        return "Contact Id: " + contactId + ", Full Name: " + fullName + ". Address: " + address + ", Phone Number: " + phoneNumber + "Email Address: " + emailAddress;
    }

}