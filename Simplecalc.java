//Simple calculator that can perform addition,subtraction,multiplication & division of 2 numbers*package sour4v.java;

import java.util.Scanner;

public class Simplecalc {
    public static void main(String[] args) {
        int operation, n1,n2;
        System.out.println("\n 1 - addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division");
        System.out.println("choose an operation");
        Scanner sc = new Scanner(System.in);
        operation = sc.nextInt();
        System.out.println("First num is");
        n1 = sc.nextInt();
        System.out.println("Second num is");
        n2 = sc.nextInt();
        int result = 0;
        switch(operation) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                result = n1 / n2;
                break;

            default :
                System.out.println("Invalid operation");
                break;
        }
        System.out.println(" result is " + result);
    }
}
