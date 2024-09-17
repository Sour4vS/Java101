//program to find sum of numbers entered by user
package sour4v.java;

import java.util.Scanner;

public class SumofNumbers {
    public static void main (String[] args) {
        int count = 0;
        System.out.println("Enter the count of numbers");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        int sum =0;
        for (int i = 1; i <= count; i++) {
            System.out.println(" Enter the number "+i);
            int number = sc.nextInt();
            sum = sum + number;
        }
        System.out.println("sum is:"+sum);
    }
}
