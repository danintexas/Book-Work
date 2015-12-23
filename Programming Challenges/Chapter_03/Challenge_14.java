/*
Daniel Gail
12/22/15

Chapter 3
Programming Challenge 14
 */

/**     Internet Service Provider, Part 2
 * Modify the program you wrote for Programming Challenge 13 so it also
 * calculates and displays the amount of money Package A customers would
 * save if they purchased Packages B or C, and the amount of money 
 * Package B customers would save if they purchased Package C. If there
 * would be no savings, no message should be printed.
 */

import javax.swing.JOptionPane;     // Needed for JOPtionPane

public class Challenge_14 
{
    public static void main(String[] args)
    {
        // Set up the variables needed
        String input;
        char plan, newPlan;
        double total, savings, hours;
        
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
        
        if (plan == 'a' && total > 13.95)
        {
            if (total > 19.95)
            {
                savings = total - 19.95;
                newPlan = 'C';
            }
            else
            {
                savings = total - 13.95;
                newPlan = 'B';
            }
            JOptionPane.showMessageDialog(null, "We would suggest you " +
                    "switch to plan " + newPlan + " as that would of " +
                    "saved you $" + savings);
        }
        
        else if (plan == 'b' && total > 19.95)
        {
            savings = total - 19.95;
            newPlan = 'C';
            
            JOptionPane.showMessageDialog(null, "We would suggest you " +
                    "switch to plan " + newPlan + " as that would of " +
                    "saved you $" + savings);
        }
        
        else 
            JOptionPane.showMessageDialog(null, "Thank you for your " +
                    "business");
        System.exit(0);
    }
}
