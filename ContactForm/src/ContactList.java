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
        this.contacts.add(contact);
    }

    public void listContacts() {
        for (int j = 0; j < contacts.size(); j++) {
            System.out.println(contacts.get(j));
        }
    }


}

