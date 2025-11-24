import java.util.Random;
import java.util.Scanner;

public class Rps1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int playerWins = 0;
        int computerWins = 0;

        System.out.println("=== Rock Paper Scissors Game ===");

        while (true) {

            System.out.println("\nEnter your choice: ");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.print("Your choice: ");
            int userChoice = sc.nextInt();

            int computerChoice = rand.nextInt(3) + 1;

            System.out.println("You chose: " + choiceName(userChoice));
            System.out.println("Computer chose: " + choiceName(computerChoice));

           
            if (userChoice == computerChoice) {
                System.out.println("Result: It's a Tie! Play again.");
            } 
            else if ((userChoice == 1 && computerChoice == 3) ||
                     (userChoice == 2 && computerChoice == 1) ||
                     (userChoice == 3 && computerChoice == 2)) {
                
                System.out.println("Result: You Win!");
                playerWins++;
                break;   
            } 
            else {
                System.out.println("Result: Computer Wins! Try again.");
                computerWins++;
            }
        }
        System.out.println("\n=== Final Score ===");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);

        sc.close();
    }

    public static String choiceName(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid";
        }
    }
}

