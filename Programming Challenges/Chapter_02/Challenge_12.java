/*
Daniel Gail
12/2/15

Chapter 2
Programming Challenge 12
 */

import java.util.Scanner;       // Imports Scanner class

/**     String Manipulator
 * Write a program that asks the user to enter the name of his or her 
 * favorite city. Use a String variable to store the input. The program 
 * should display the following:
 *      The number of characters in the city name
 *      The name of the city in all uppercase letters
 *      The name of the city in all lowercase letters
 *      The first character in the name of the city
 */

public class Challenge_12 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); // Set up for input
        String word;                    // String variable to manipulate
        
        // Request word to manipulate
        System.out.print("Please enter a city name to manipulate: ");
        word = keyboard.nextLine();
        
        // Print out all requested
        System.out.println("The city you entered has " + 
                word.length() + " characters.");
        System.out.println("The city you entered is: " +
                word.toLowerCase());
        System.out.println("The city you entered is: " +
                word.toUpperCase());
        System.out.println("The first character of the city you " +
                "entered is: " + word.charAt(0));
        
        
    }
}
