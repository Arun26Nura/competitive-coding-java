package com.arun.programs;

import java.util.Scanner;

/**
 * Write a Java program that reads an integer between 0 and 1000 and adds all the
 * digits in the integer.
 * Test Data
 * Input an integer between 0 and 1000: 565
 * Expected Output :
 * The sum of all digits in 565 is 16
 */
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Number between 0 and 1000");
        int number= scanner.nextInt();
        int sum=0;
        while (number>0){
            sum+=number%10;
            number=number/10;
        }
        System.out.println(sum);
        scanner.close();
    }
}
