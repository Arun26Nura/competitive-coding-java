package com.arun.loops;

import java.util.Scanner;

/**
 * Write a Java program that keeps a number from the user and generates an integer
 * between 1 and 7 and displays the name of the weekday.
 * Test Data
 * Input number: 3
 * Expected Output :
 * Wednesday
 */
public class Weekdays {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the days number: ");
        int daysNum=scanner.nextInt();
        switch (daysNum){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            default:
                System.out.println("Invalid");
                break;

        }
    }
}
