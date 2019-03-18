import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by eugene on 2019-03-12.
 */
public class Main {
    public static void printMenu() {
        System.out.println("+==   Contact App  ==+");
        System.out.println("|1.List all Contacts |");
        System.out.println("|2. Add New Contact  |");
        System.out.println("|3.  Remove Contact  |");
        System.out.println("|4.  Update Contact  |");
        System.out.println("|5.     Quit         |");
        System.out.println(" ____________________");
        System.out.println("Choose your Option in PhoneBook: ");
    }
    public static void main(String[] args) {
        Scanner chooseOption = new Scanner(System.in);
        ContactList contactList = new ContactList();
        int userChose = 0;
        while (userChose != 5) {
            printMenu();
            userChose = chooseOption.nextInt();
            Contact contact = null;
            try {
                if (userChose == 5) {
                    System.out.println("Good Bye");
                    break;

                } else if (userChose == 1) {
                    System.out.println("Here is all Contacts: \n ");
                    contactList.listContacts();

                } else if (userChose == 2) {
                    contactList.addContact(contact);
                    System.out.println();



                } else if (userChose == 3) {
                    contactList.removeContact(contact);
                    System.out.println();

                }
                else if (userChose == 4){
                    contactList.updateContacts(contact);
                    contactList.addContact(contact);
                    System.out.println();
                }

                // adding contact menu
                // enter name
                // enter mobile...

            }catch (Exception e){
                System.out.println("Error Format : your input is wrong format try again");
            }
        }

    }
}