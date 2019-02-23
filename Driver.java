import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine(); // user input

        Model p1 = new Model("Peter", "Parker", 70, 120, false, true);
        p1.setHeight(6, 13);
        p1.printDetails();
    }
}