package com.arun.loops;

import java.util.Scanner;

/**
 * Take three numbers from the user and print the greatest number.
 * Test Data
 * Input the 1st number: 25
 * Input the 2nd number: 78
 * Input the 3rd number: 87
 * Expected Output :
 * The greatest: 87
 */
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int firstNum= scanner.nextInt();
        System.out.println("Enter the second Number:");
        int secondNum= scanner.nextInt();
        System.out.println("Enter the third Number:");
        int thirdNum= scanner.nextInt();

        if(firstNum>secondNum && firstNum>thirdNum){
            System.out.println(" The Greatest: "+ firstNum);
        } else if (secondNum>thirdNum) {
            System.out.println(" The Greatest: "+ secondNum);
        }else {
            System.out.println(" The Greatest: "+ thirdNum);
        }
    }
}
