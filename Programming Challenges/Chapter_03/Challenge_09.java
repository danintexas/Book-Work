/*
Daniel Gail
12/16/15

Chapter 3
Programming Challenge 9
 */

/**     Shipping Charges
 * The Fast Freight Shipping Company charges the following rates:
 *      Weight of Package               Rate per 500 miles shipped
 * -----------------------------------------------------------------
 *      2 lbs or less                               $1.10
 *      Over 2 lbs but not more than 6 lbs          $2.20
 *      Over 6 lbs but not more than 10 lbs         $3.70
 *      Over 10 lbs                                 $3.80
 * 
 * The shipping charges per 500 miles are not prorated. For example,
 * if a 2 lbs package is shipped 550 miles, the charges would be $2.20.
 * Write a program that asks the user to enter the weight of a package
 * and then displays the shipping charges.
 */

/////////////////////////////////////////////////////////////
//  I should make note in this program I used a double 
//  for a variable to track money. This should never be done
//  as money needs to be tracked precisely and the below program
//  using double values does not do that. I will be learning 
//  more later on a better way to track money. Read briefly about
//  this topic off the oracle website.
/////////////////////////////////////////////////////////////

import javax.swing.JOptionPane;         // Needed for JOptionPane

public class Challenge_09 
{
    public static void main(String[] args)
    {
        // Variables needed        
        String input;
        double weight, miles, totalCost, per500, remainingDistance;
        
        // Ask the user for the weight and distance sent
        input = JOptionPane.showInputDialog(null, "Please enter " +
                "the weight in pounds of the package sent.");
        weight = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(null, "Please enter " +
                "the distance in miles the package was sent.");
        miles = Double.parseDouble(input);
        
        per500 = (int)(miles / 500);
        remainingDistance = (miles % 500);
        
        if (remainingDistance > 0)
            per500 = per500 + 1;
            
        if (weight <= 2)
            totalCost = per500 * 1.1;
        
        else if (weight > 2 && weight <= 6)
            totalCost = per500 * 2.2;
         
        else if (weight > 6 && weight <= 10)
            totalCost = per500 * 3.7;
        
        else 
            totalCost = per500 * 3.8;
                
        JOptionPane.showMessageDialog(null, "Total cost of shipping is" +
                " $" + totalCost);
        System.exit(0);
    }
}
