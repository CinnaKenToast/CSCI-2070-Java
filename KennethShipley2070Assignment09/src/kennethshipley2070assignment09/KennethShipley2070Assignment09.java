/*
 * Kenneth Shipley
 * CSCI 2070-08
 * February 27, 2018
 * This program plays a game of TV Remote, Coffee Table, Lamp: a varition on
 * Rock, Paper, Scissors
 */
package kennethshipley2070assignment09;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rockm
 */
public class KennethShipley2070Assignment09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String playAgain = "yes";

        Scanner scan = new Scanner(System.in);
        Random rng = new Random();

        sayHi();

        displayRules();

        while ("yes".equals(playAgain.toLowerCase())) {
            displayItemChoices();
            int playerChoice = getUserChoice(scan);
            int cpuChoice = getCpuChoice(rng);

            displayCpuChoice(cpuChoice);

            displayWhoWon(playerChoice, cpuChoice);

            playAgain = promtUserToPlayAgain(scan);
        }

        sayBye();
    }

    private static void sayBye() {
        System.out.println("Thanks for playing!");
    }

    private static String promtUserToPlayAgain(Scanner scan) {
        String playAgain;
        scan.nextLine();
        System.out.println("Would you like to play again? [Yes] ");
        playAgain = scan.nextLine();
        return playAgain;
    }

    private static void displayWhoWon(int playerChoice, int cpuChoice) {
        //TV Remote beats Lamp            1 beats 3
        //Coffe Table beats TV Remote     2 beats 1
        //Lamp beats COffee Table         3 beats 2
        
        if (playerChoice == 1 && cpuChoice == 2) {
            System.out.println("Computer won!");
        } else if (playerChoice == 1 && cpuChoice == 3) {
            System.out.println("You won!");
        } else if (playerChoice == 2 && cpuChoice == 1) {
            System.out.println("You won!");
        } else if (playerChoice == 2 && cpuChoice == 3) {
            System.out.println("Computer won!");
        } else if (playerChoice == 3 && cpuChoice == 1) {
            System.out.println("Computer won!");
        } else if (playerChoice == 3 && cpuChoice == 2) {
            System.out.println("You won!");
        } else {
            System.out.println("You tied!");
        }
    }

    private static void displayCpuChoice(int cpuChoice) {
        if (cpuChoice == 1) {
            System.out.println("The computer chose TV Remote");
        } else if (cpuChoice == 2) {
            System.out.println("The computer chose Coffee Table");
        } else {
            System.out.println("The computer chose Lamp");
        }
    }

    private static int getCpuChoice(Random rng) {
        int cpuChoice = rng.nextInt(2) + 1;
        return cpuChoice;
    }

    private static int getUserChoice(Scanner scan) {
        System.out.print("Pick your Poison: ");
        int playerChoice = scan.nextInt();
        return playerChoice;
    }

    private static void displayItemChoices() {
        System.out.println("\n1: TV Remote");
        System.out.println("2. Coffee Table");
        System.out.println("3. Lamp");
    }

    private static void displayRules() {
        System.out.println("This game plays exactly like Rock-Paper-Scissors");
        System.out.println("TV Remote beats Lamp");
        System.out.println("Coffee Table beats TV Remote");
        System.out.println("Lamp beats Coffee Table");
    }

    private static void sayHi() {
        System.out.println("This is Ken's game of TV Remote-Coffee Table-Lamp");
    }

}
