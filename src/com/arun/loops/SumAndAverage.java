package com.arun.loops;

import java.util.Scanner;

/**
 * Write a program in Java to input 5 numbers from keyboard and find their sum and
 * average.
 * Test Data
 * Input the 5 numbers : 1 2 3 4 5
 * Expected Output :
 * Input the 5 numbers :
 * 1
 * 2
 * 3
 * 4
 * 5
 * The sum of 5 no is : 15
 * The Average is : 3.0
 */
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the total numbers:");
        int n= scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the number: "+ i);
            int num= scanner.nextInt();
            sum+=num;
        }
        System.out.println(sum);
        System.out.println(sum/n);
    }
}

