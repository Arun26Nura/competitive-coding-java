package com.arun.loops;
//Write a program in Java to display the first 10 natural numbers.
public class NaturalNumbers {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        int index=1;
        int input=1;
        while(index<=10){
            if (input % 2 != 0) {
                System.out.println(input);
                index++;
            }
           input++;
        }
    }
}
