package com.arun.programs;

import java.util.Scanner;

/**
 * Write a Java program to convert minutes into number of years and days.
 * Test Data
 * Input the number of minutes: 3456789
 * Expected Output :
 * 3456789 minutes is approximately 6 years and 210 days
 */
public class MinutesToYears {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of Minutes:");
        int minutes= scanner.nextInt();
        int hour=minutes/60;
        int day= hour/24;
        int year= day/365;
        int remainingDays= day%365;
        System.out.println("Years:"+ year +" Days:"+remainingDays);
        scanner.close();
    }
}
