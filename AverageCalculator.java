package sour4v.java;
import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many numbers they want to enter
        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        // Validate if the input is greater than 0
        if (count <= 0) {
            System.out.println("You must enter a positive number of inputs.");
            return;
        }

        double sum = 0;

        // Loop to collect the numbers from the user
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = scanner.nextDouble(); // Reading a floating-point number
            sum += number;

        }

        // Calculate the average
        double average = sum / count;

        // Print the result
        System.out.println("The average of the entered numbers is: " + average);

        // Close the scanner
        scanner.close();
    }
}

