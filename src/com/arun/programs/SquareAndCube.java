package com.arun.programs;

import java.util.Scanner;

/**
 * Write a Java program that reads a number and display the square, cube, and fourth
 * power.
 * Sample Input: 12
 * Expected Output:
 * Square: 144
 * Cube: 1728
 * Fourth power: 20736
 */
public class SquareAndCube {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= scanner.nextInt();
        System.out.println("Square: "+ number*number);
        System.out.println("Cube: "+ number*number*number);
        System.out.println("Fourth power: "+ number*number*number*number);
        scanner.close();
    }
}
