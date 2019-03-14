import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nr = 5;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number that fits your chose");
        System.out.print("Your chose: ");
        int chose;
        chose = keyboard.nextInt();
        keyboard.nextLine(); // add this line
        while(chose < nr){
            if (chose<5){
                System.out.print("Your guess: ");
                System.out.println("That is incorrect. Guess again.");
            }
            else if (chose >5)
                chose = keyboard.nextInt();
                System.out.println("That's right! You're a good guesser");
                keyboard.nextLine();



        }
    }

}
