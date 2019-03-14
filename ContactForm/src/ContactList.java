import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList {
    List<Contact> contactlist = new ArrayList<>();
    public static void main(String[] args) {
        ContactList list = new ContactList();
        while (true) {
            System.out.println("+==   Contact App  ==+");
            System.out.println("|1.List all Contacts |");
            System.out.println("|2. Add New Contact  |");
            System.out.println("|3.  Remove Contact  |");
            System.out.println("|4.  Update Contact  |");
            System.out.println("|5.     Quit         |");
            System.out.println(" ____________________");
            System.out.println("Choose your Option in PhoneBook: ");
            Scanner chooseOption = new Scanner(System.in);
            String userChose = chooseOption.nextLine();

            switch (userChose) {
                case "1":
                    list.addContact();
                    break;
                case "2":
                    list.viewContacts();
                    break;
                case "3":
                    list.removeContact();
                    break;
                case "4":
                    list.updContact();
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Error");
                    break;
            }
        }


    }

    public void addContact() {

    }

}



