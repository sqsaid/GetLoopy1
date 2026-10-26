import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int rollCount = 0;

            // Print the header row exactly like the instructions
            System.out.printf("%-8s%-12s%-12s%-12s%-8s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            while (true) {
                rollCount++;

                // Roll 3 dice (1 to 6)
                int die1 = rnd.nextInt(6) + 1;
                int die2 = rnd.nextInt(6) + 1;
                int die3 = rnd.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                // Neatly print the row using printf
                System.out.printf("%4d%12d%12d%12d%10d\n", rollCount, die1, die2, die3, sum);

                // Stop rolling if we hit a triple
                if (die1 == die2 && die2 == die3) {
                    System.out.println("\nTriple found after " + rollCount + " rolls!");
                    break;
                }
            }

            // Ask the user if they want to run it again
            System.out.print("Do you want to roll again? [Y/N]: ");
            String response = in.nextLine();
            if (response.equalsIgnoreCase("N")) {
                playAgain = false;
            }
            System.out.println();
        }

        System.out.println("Thanks for playing!");
    }
}
