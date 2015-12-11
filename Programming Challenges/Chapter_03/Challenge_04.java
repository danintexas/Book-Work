/*
Daniel Gail
12/10/15

Chapter 3
Programming Challenge 4
 */

import java.util.Scanner;       // Needed for user input

/** Test Scores and Grade
 * Write a program that has variables to hold three test scores. The 
 * program should ask the user to enter three test scores and then
 * assign the values entered to the variables. The program should display
 * the average of the test scores and the letter grade that is assigned
 * for the test core average. 
 */

public class Challenge_04 
{
    public static void main(String[] args)
    {
        // Set up my variables needed
        Scanner keyboard = new Scanner(System.in);  // For input
        double testOne, testTwo, testThree;        // For the three tests
        double average;                         // For the average 
        
        System.out.println("We will get the average of three test " +
                    "scores and your letter grade for that.");
        
        // Gather input
        System.out.print("Please enter in the first test grade: ");
        testOne = keyboard.nextDouble();
        
        System.out.print("Please enter in the second test grade: ");
        testTwo = keyboard.nextDouble();
        
        System.out.print("Please enter in the third test grade: ");
        testThree = keyboard.nextDouble();
        
        // Calculate
        average = (testOne + testTwo + testThree) / 3;
        
        // Return the results
        System.out.println("Your average was: " + average);
        
        if (average < 60)
            System.out.println("Your grade was an F");
                
        else if (average > 59 && average < 70)
            System.out.println("Your grade was a D");
        
        else if (average > 69 && average < 80)
            System.out.println("Your grade was a C");
        
        else if (average > 79 && average < 90)
            System.out.println("Your grade was a B");
        
        else if (average > 89 && average < 101)
            System.out.println("Your grade was an A");
        
        else 
            System.out.println("Average was out of bounds. " +
                    "Please check your scores.");
    }
}
