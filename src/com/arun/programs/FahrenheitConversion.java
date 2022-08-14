package com.arun.programs;

import java.util.Scanner;

/**
 * Write a Java program to convert temperature from Fahrenheit to Celsius degree.
 * Test Data
 * Input a degree in Fahrenheit: 212
 * Expected Output:
 * 212.0 degree Fahrenheit is equal to 100.0 in Celsius.
 */

public class FahrenheitConversion {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the fahrenheit temperature");
        double fahrenheit=scanner.nextDouble();
        double conversion=2.12d;

        double celsius= fahrenheit/conversion;
        scanner.close();
        System.out.println(celsius);
    }
}

