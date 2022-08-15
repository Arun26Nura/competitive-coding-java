package com.arun.loops;

/**
 * . Write a Java program that reads an positive integer and count the number of digits
 * the number (less than ten billion) has.
 * Test Data
 * Input an integer number less than ten billion: 125463
 * Expected Output :
 * Number of digits in the number: 6
 */
public class Digits {
    public static void main(String[] args) {
        int number= 1234563;
        int index=0;
        while (number>0){
            number=number/10;
            index++;
        }
        System.out.println(index);




    }
}
