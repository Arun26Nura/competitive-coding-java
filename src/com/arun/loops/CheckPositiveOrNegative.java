package com.arun.loops;

import java.util.Scanner;

/**
 * Write a Java program to get a number from the user and print whether it is positive or
 * negative.
 * Test Data
 * Input number: 35
 * Expected Output :
 * Number is positive
 */
public class CheckPositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number:");
        int number= scanner.nextInt();
        if(number==0)
            System.out.println("Number is Zero");

        String result= number>0 ? "Number is Positive": "Number is negative";
        System.out.println(result);
        scanner.close();
   }
}
