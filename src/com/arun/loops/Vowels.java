package com.arun.loops;

import java.util.List;
import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not
 * a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 * Test Data
 * Input an alphabet: p
 * Expected Output :
 * Input letter is Consonant
 */
public class Vowels {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input");
        String input= scanner.next();
        System.out.println(checkInput(input));
    }

    private static String checkInput(String input) {
        if(input.length()>1)
            return "Invalid Input";
        String[] vowels={"a","e","i","o","u"};
        List<String> list= List.of("a","e","i","o","u");
       for(String ind: vowels){
           if(input.equalsIgnoreCase(ind)){
               System.out.println("Vowel");
           }
       }
       if(list.contains(input)){
           System.out.println("Vowels");
       }

        if(input.equalsIgnoreCase("a") || input.equalsIgnoreCase("e")
                || input.equalsIgnoreCase("i") || input.equalsIgnoreCase("o")
                || input.equalsIgnoreCase("u")){
            return "Vowels";

        }else{
            return "Consonants";
        }
    }


}
