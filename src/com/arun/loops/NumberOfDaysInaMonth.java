package com.arun.loops;

import java.util.Scanner;

/**
 * Write a Java program to find the number of days in a month.
 * Test Data
 * Input a month number: 2
 * Input a year: 2016
 * Expected Output :
 * February 2016 has 29 days
 */
public class NumberOfDaysInaMonth {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the year");
        int year=scanner.nextInt();
        System.out.println("Enter the month");
        int month=scanner.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                if(year%4==0){
                    if(year%100==0){
                        if(year%400==0){
                            System.out.println("29 days");
                        }else{
                            System.out.println("28 Days");
                        }
                    }else {
                        System.out.println("29 days");
                    }
                }else{
                    System.out.println("28 Days");
                }
                break;
            default:
                System.out.println("Invalid Inputs");
                break;
        }




    }

}
