package com.arun.loops;

/**
 * Write a Java program that accepts three numbers and prints "All numbers are equal"
 * if all three numbers are equal, "All numbers are different" if all three numbers are
 * different and "Neither all are equal or different" otherwise.
 * Test Data
 * Input first number: 2564
 * Input second number: 3526
 * Input third number: 2456
 * Expected Output :
 * All numbers are different
 */
public class EqualsOrDiff {
    public static void main(String[] args) {
        int a=5;
        int b=4;
        int c=2;
        if(a==b && a==c && b==c){
            System.out.println("All are same");
        }
        else if(a==b || a==c || b==c){
            System.out.println("Not equals nor different");
        }else{
            System.out.println("Different");
        }





    }
}
