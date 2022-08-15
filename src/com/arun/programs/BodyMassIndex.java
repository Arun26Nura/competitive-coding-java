package com.arun.programs;

import java.util.Scanner;

/**
 * Write a Java program to compute body mass index (BMI).
 * Test Data
 * Input weight in pounds: 452
 * Input height in inches: 72
 * Expected Output:
 * Body Mass Index is 61.30159143458721
 */
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the weight:");
        float weight=scanner.nextFloat();
        System.out.println("Enter the height:");
        float height= scanner.nextFloat();


        float bmi= (weight*703)/(height*height);
        System.out.println(bmi);


    }
}
