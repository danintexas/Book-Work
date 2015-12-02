/*
Daniel Gail
12/2/15

Chapter 2
Programming Challenge 10
 */

/**     Test Average
 * Write a program that asks the user to enter three test scores. The
 * program should display each test score, as well as the average of the
 * scores.
 */

import java.util.Scanner;       // Calls the scanner class

public class Challenge_10 
{
    public static void main(String[] args)
    {
        // Set up the variables needed
        int testOne, testTwo, testThree;    // User entered test scores
        double average;                     // Average of those scores

        // Set up Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Request test scores
        System.out.print("Please enter test score one: ");
        testOne = keyboard.nextInt();
        
        System.out.print("Please enter test score two: ");
        testTwo = keyboard.nextInt();
        
        System.out.print("Please enter test score three: ");
        testThree = keyboard.nextInt();
        
        // Make the calculation
        average = (testOne + testTwo + testThree) / 3;
        
        // Output everything. 
        System.out.println("The test scores entered were:\n" + testOne +
                            "\n" + testTwo + "\n" + testThree + "\n" +
                            "\nThe average is: " + average);
    }
}
