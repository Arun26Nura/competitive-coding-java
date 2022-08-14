package com.arun.programs;

import java.util.Scanner;

/**
 * Write a Java program to break an integer into a sequence of individual digits.
 * Test Data
 * Input six non-negative digits: 123456
 * Expected Output :
 * 1 2 3 4 5 6
 */
public class SequenceOfIndividualNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= scanner.nextInt();
        int reverse=0;
        while (number>0){
            int div= number/10;
            int remain= number%10;
            reverse=reverse*10+remain;
            number=div;
        }
        number=reverse;
        while (number>0){
            int div= number/10;
            int remain= number%10;
            System.out.print(remain +" ");
            number=div;
        }
        scanner.close();
    }
}
