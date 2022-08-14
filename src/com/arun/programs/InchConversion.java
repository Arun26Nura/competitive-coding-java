package com.arun.programs;

import java.util.Scanner;

/**
 * Write a Java program that reads a number in inches, converts it to meters.
 * Note: One inch is 0.0254 meters.
 * Test Data
 * Input a value for inch: 1000
 * Expected Output :
 * 1000.0 inch is 25.4 meters.
 */
public class InchConversion {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float oneInch= 0.0254f;
        System.out.println("Enter the Inch Input value: ");
        float inchVal= scanner.nextFloat();
        float meterValue= inchVal*oneInch;
        System.out.println(meterValue);
    }
}
