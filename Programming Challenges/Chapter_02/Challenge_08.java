/*
Daniel Gail
12/2/15

Chapter 2
Programming Challenge 8
 */

import java.util.Scanner;       // Import Scanner class to gather 
                                // input from the user

/**     Sales Tax
 * Write a program that will ask the user to enter the amount of a
 * purchase. The program should then compute the state and county
 * sales tax. Assume the state sales tax is 4 percent and the county
 * sales tax is 2 percent. The program should display the amount of 
 * the purchase, the state sales tax, the county sales tax, the total
 * sales tax, and the total of the sale (Which is the sum of the amount
 * of purchase plus the total sales tax).
 */

public class Challenge_08 
{
    public static void main(String[] args)
    {
        // Set up the variables I need for this challenge
        double amount;              // Amount of the product 
                                    // entered by user
        double stateTax = 0.04;     // State tax rate
        double totalState;          // State tax amount
        double countyTax = 0.02;    // County tax rate
        double totalCounty;         // County tax amount
        double totalAmount;         // Total amount
        
        // Create a new Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // Get the amount of the item
        System.out.println("What is the cost of the item you bought: ");
        amount = keyboard.nextDouble();
        
        // Make the calculations
        totalState = amount * stateTax;
        totalCounty = amount * countyTax;        
        totalAmount = amount + totalState + totalCounty;
                
        // Display the information
        System.out.println("The item amount you entered was: $" +
                amount);
        System.out.println("The County sales tax on this item is: $" +
                totalCounty);
        System.out.println("The State sales tax on this item is: $" +
                totalState);
        System.out.println("\nThe full total amount of this item is: $" +
                totalAmount);
        
    }
}
