/*
Daniel Gail
12/22/15

Chapter 3
Programming Challenge 13
 */

/**     Internet Service Provider
 * An Internet service provider has three different subscription packages
 * for its customers.
 *      Package A:  For $9.95 per month 10 hours of access are provided. 
 *          Additional hours are $2.00 per hour.
 *      Package B:  For $13.95 per month 20 hours of access are provided.
 *          Additional hours are $1.00 per hour.
 *      Package C:  For $19.95 per month unlimited access is provided.
 * Write a program that calculates a customer's monthly bill. It should
 * ask the user to enter the letter of the package the customer has 
 * purchased (A, B, or C) and the number of hours that were used. It 
 * should then display the total charges.
 */

import javax.swing.JOptionPane;     // Needed for JOPtionPane

public class Challenge_13 
{
    public static void main(String[] args)
    {
        // Set up the variables needed
        String input;
        char plan;
        double total, hours;
        
        // Request the needed input
        input = JOptionPane.showInputDialog(null, "Please enter in " +
                "the internet package that you currently have: (A,B,C)");
        plan = input.charAt(0);
        plan = Character.toLowerCase(plan);
        
        input = JOptionPane.showInputDialog(null, "Please enter the " +
                "number of hours you accessed the Internet: ");
        hours = Double.parseDouble(input);
        
        // Calculate the total bill
        if (plan == 'a')
        {
            if (hours > 10)
               total = 9.95 + ((hours - 10) * 2);
            else 
                total = 9.95;
        }
        else if (plan == 'b')
        {
            if (hours > 20)
                total = 13.95 + ((hours - 20) * 1);
            else 
                total = 13.95;
        }
        else 
            total = 19.95;
        
        // Display the total bill
        JOptionPane.showMessageDialog(null, "The total bill is: $" + 
                total);
        
        System.exit(0);
    }
}
