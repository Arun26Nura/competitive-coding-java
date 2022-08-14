package com.arun.programs;

import java.util.Scanner;

/**
 * Write a Java program that accepts two integers from the user and then prints the
 * sum, the difference, the product, the average, the distance (the difference between
 * integer), the maximum (the larger of the two integers), the minimum (smaller of the two
 * integers).
 * Test Data
 * Input 1st integer: 25
 * Input 2nd integer: 5
 * Expected Output :
 * Sum of two integers: 30
 * Difference of two integers: 20
 * Product of two integers: 125
 * Average of two integers: 15.00
 * Distance of two integers: 20
 * Max integer: 25
 * Min integer: 5
 */
public class MathematicalActions {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the firstNumber");
        int firstNum= scanner.nextInt();
        System.out.println("Enter the secondNumber");
        int secondNum= scanner.nextInt();
        int maxNumber;
        int minNumber;
        if(firstNum > secondNum) {
            maxNumber = firstNum;
            minNumber=secondNum;
        }else{
            minNumber = firstNum;
            maxNumber=secondNum;
        }
        System.out.println("Sum of two integers:" + (firstNum+secondNum));
        System.out.println("Difference of two integers:" + (maxNumber-minNumber));
        System.out.println("Product of two integers:" + (firstNum*secondNum));
        System.out.println("Average of two integers:" + (firstNum+secondNum)/2);
        System.out.println("Max integer:"+maxNumber);
        System.out.println("Min integer:"+minNumber);


    }
}
