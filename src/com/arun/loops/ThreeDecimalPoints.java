package com.arun.loops;

import java.util.Scanner;

/**
 * Write a Java program that reads in two floating-point numbers and tests whether they
 * are the same up to three decimal places.
 * Test Data
 * Input floating-point number: 1256
 * Input floating-point another number: 3254
 * Expected Output :
 * They are different
 */
public class ThreeDecimalPoints {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum= scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum= scanner.nextInt();

        String result= firstNum%1000 == secondNum%1000 ? "Same": "Different";
        System.out.println(result);


    }
}
