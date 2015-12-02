/*
Daniel Gail
12/2/15

Chapter 2
Challenge 11
 */

import java.util.Scanner;   // Calls up the Scanner class

/**     Circuit Board Profit
 *An electronics company sells circuit boards at a 40 percent profit.
 * If you know the retail price of a circuit board, you can calculate
 * its profit with the following formula:
 *      Profit = Retail Price x 0.4
 * Write a program that asks the user for the retail price of a circuit
 * board, calculates the amount of profit earned for that product, and
 * displays the results on the screen.
 */

public class Challenge_11 
{
    public static void main(String[] args)
    {
        // Set up all the variables
        Scanner keyboard = new Scanner(System.in);  // Sets up for
                                                    // user input
        double retail;                      // Retail price
        double profitPercent = 0.4;         // Profit percentage
        double profitTotal;                 // Total profit
        
        // Collect input
        System.out.print("Please enter in the retail price: ");
        retail = keyboard.nextDouble();
        
        // Calculate the profit
        profitTotal = retail + (retail * profitPercent);
        
        // Output
        System.out.println("\nThe total selling price of each item is: $" +
                        profitTotal + "\nWith the actual profit on " +
                        "each item being: $" + (retail * profitPercent));
    }
}
