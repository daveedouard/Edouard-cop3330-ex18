/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex18;

import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String unit = input.nextLine();

        if(unit.equals("C")){
            System.out.print("Please enter the degrees in Fahrenheit: ");
            int fahrenheit = input.nextInt();

            int celsius = (fahrenheit-32)*5/9;
            System.out.println("The temperature in Celsius is "+celsius+".");
        }
        else if(unit.equals("F")){
            System.out.print("Please enter the degrees in Celsius: ");
            int celsius = input.nextInt();

            int fahrenheit = (celsius*9/5)+32;
            System.out.println("The temperature in Fahrenheit is "+fahrenheit+".");
        }
    }
}
