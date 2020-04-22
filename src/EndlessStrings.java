import java.util.Scanner;

public class EndlessStrings {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        while (!(userInput.equalsIgnoreCase("End"))) {
            System.out.print("Enter a word or enter End: ");
            userInput = keyboard.nextLine();
            System.out.println(userInput);
        }

        System.out.println("Thank you for participation.");

    }
}
