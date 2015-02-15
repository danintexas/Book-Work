/*
    Daniel Gail
    Jan 27, 2015

    Chapter 4
    Code Listing 4-8
    Page 216
*/

import java.util.Scanner;   // Needed for the Scanner class

/*
    This program demonstrates a user controlled for loop
*/
public class UserSquares 
{
    public static void main(String[] args)
    {
        int number;         // Loop control variable
        int maxValue;       // Maximum value to display
        
        System.out.println("I will display a table of " +
                "numbers and their squares.");
        
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        // Get the maximum value to display.
        System.out.print("How high should I go? ");
        maxValue = keyboard.nextInt();
        
        // Display the table.
        System.out.println("Number Number Squared");
        System.out.println("=======================");
        for (number = 1; number <= maxValue; number++)
        {
            System.out.println(number + "\t\t" +
                    number * number);
        }
    }
}