import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by eugene on 2019-03-12.
 */
public class ContactList {

    private ArrayList<Contact> contacts;

    public ContactList() {
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID of contact: ");
        Integer id = input.nextInt();

        System.out.println("Enter Yor Full Name: ");
        String fullName = input.nextLine();

        while (fullName.length() < 4) {
            System.out.println("Your Full Name need to be at least 4 characters long");
            fullName = input.nextLine();
        }
        System.out.println("Enter Yor Phone Number ");
        Integer phoneNumber = input.nextInt();
        String phoneSize = phoneNumber.toString();
        while (phoneSize.length()<9){
            System.out.println("Your number should has 9 digits");
            phoneNumber = input.nextInt();
        }

        String address = input.nextLine();
        while (address.length() < 7){
            System.out.println("Enter Yor Home address ");
            address = input.nextLine();
        }

        System.out.println(id + " Succesufully added to ContactList !");
        contact = new Contact(id,fullName, phoneNumber, address);
        this.contacts.add(contact);

    }

    public void listContacts() {
        for (int j = 0; j < contacts.size(); j++) {
            System.out.println(contacts.get(j));
        }
    }


    public void removeContact(Contact contact) {
        for (int j = 0; j < contacts.size(); j++){
            System.out.println(contacts.get(j));

        }
        System.out.println("Choose contact to remove : from 0 to..");
        Scanner chooseContact = new Scanner(System.in);
        int j = chooseContact.nextInt();
        contacts.remove(j);
        }

    public void updateContacts(Contact contact){
        for (int j = 0; j < contacts.size(); j++){
            System.out.println(contacts.get(j));

        }
        System.out.println("Choose contact to update : from 0 to..");
        Scanner chooseContact = new Scanner(System.in);
        int j = chooseContact.nextInt();
        contacts.remove(j);
    }
}
