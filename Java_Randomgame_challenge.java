package sour4v.java;
import java.util.Random;
import java.util.Scanner;

public class Java_Randomgame_challenge {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Random Game Challenge");
        System.out.println("Start the game?");
        System.out.println("\t 1. yes");
        System.out.println("\t 2. no");
        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();

        // Loop until the player selects "Yes"
        while (answer != 1) {
            System.out.println("Start the game?");
            System.out.println("\t 1. yes");
            System.out.println("\t 2. no");
            answer = scanner.nextInt();
        }

        // Start the guessing game logic
        Random random = new Random();
        int randomNum = random.nextInt(15); // Random number between 0 and 14
        System.out.println("Enter a number less than 15");

        int input_number = scanner.nextInt();
        int limit = 5;
        int attempt = 0;
        boolean is_winner = false;
        boolean is_finish = false;

        // Main game loop
        while (!is_finish) {
            attempt++;
            if (attempt <= limit) {
                if (input_number == randomNum) {
                    is_winner = true;
                    is_finish = true;
                } else if (input_number > randomNum) {
                    System.out.println("Guess lower number");
                    input_number = scanner.nextInt();
                } else {
                    System.out.println("Guess higher number");
                    input_number = scanner.nextInt();
                }
            } else {
                // If attempts exceed the limit, end the game
                is_finish = true;
            }
        }

        // Display the result
        if (is_winner) {
            System.out.println("You won in " + attempt + " attempts!");
        } else {
            System.out.println("You lost! The correct number was " + randomNum);
        }
    }
}
