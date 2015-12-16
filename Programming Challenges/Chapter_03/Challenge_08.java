/*
Daniel Gail
12/14/15

Chapter 3
Programming Challenge 8
 */

/**     Software Sales
 * A software company sells a package that retails for $99. Quantity 
 * discounts are given according to the following table:
 *      Quantity        Discount
 *      10 - 19         20%
 *      20 - 49         30%
 *      50 - 99         40%
 *      100 or more     50%
 * Write a program that asks the user to enter the number of packages 
 * purchased. The program should then display the amount of the discount
 * (if any) and the total amount of the purchase after the discount.
 */

import javax.swing.JOptionPane;     // Needed for JOptionPane

public class Challenge_08 
{
    public static void main(String[] args)
    {
        String input;                   // For user input
        double bought, total;           // Number bought & total cost
        double discount;                // Percent discount
        
        input = JOptionPane.showInputDialog(null, "Please enter " +
                "the number of packages purchased.");
        
        bought = Double.parseDouble(input);
        
        if (bought < 10)
            discount = 0.0;
        else if (bought >= 10 && bought <= 19)
            discount = 0.2;
        else if (bought >= 20 && bought <= 49)
            discount = 0.3;
        else if (bought >= 50 && bought <= 99)
            discount = 0.4;
        else 
            discount = 0.5;
        
        // Calculate the total
        total = (bought * 99) * discount; 
        
        JOptionPane.showMessageDialog (null, "Your discount on this " +
                "order is: " + (discount * 100) + "%");
        
        JOptionPane.showMessageDialog (null, "Total cost of this order " +
                " is: $" + total);
        
        System.exit(0);
    }
}
