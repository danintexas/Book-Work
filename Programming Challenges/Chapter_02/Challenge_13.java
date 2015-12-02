/*
Daniel Gail
12/2/15

Chapter 2
Programming Challenge 13
 */

import java.util.Scanner;       // Calls up the Scanner class

/**     Restaurant Bill
 * Write a program that computes the tax and tip on a restaurant bill.
 * The program should ask the user to enter the charge for the meal. The
 * tax should be 6.75 percent of the meal charge. The tip should be 15 
 * percent of the total after adding the tax. Display the meal charge, 
 * tax amount, tip amount, and total bill on the screen.
 */

public class Challenge_13 
{
    public static void main(String[] args)
    {
        // Setting up the variables for this program
        Scanner keyboard = new Scanner(System.in);
        double tax = .0675;         // Tax rate
        double tip = .15;           // Tip amount
        double total;               // Total of the base bill
        double taxTotal;            // Total with tax
        double tipTotal;            // Total of tip
        double totalBill;           // Total bill
        
        // Request input in the form of the amount of the bill
        System.out.print("Please enter in the total of the bill: $");
        total = keyboard.nextDouble();
        
        // Perform calculations
        taxTotal = (total * tax);
        tipTotal = (total * tip);
        totalBill = total + tipTotal + taxTotal;
        
        // Output results
        System.out.println("Here are the results\n\nMeal Charge: " +
                            total + "\nTax was: " + taxTotal + 
                            "\nTip was: " + (tipTotal) + "\n\n" +
                            "The total of the bill was: " + totalBill);
    }
}
