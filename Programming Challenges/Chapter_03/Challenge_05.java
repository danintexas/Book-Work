/*
Daniel Gail
12/11/05

Chapter 3
Programming Challenge 5
 */

import javax.swing.JOptionPane;  // Needed to use JOptionPane class

/**     Mass and Weight
 * Scientists measure an object's mass in kilograms and its weight in
 * Newtons. If you know the amount of mass that an object has, you can
 * calculate its weight, in Newtons, with the following formula:
 *      Weight = mass x 9.8
 * Write a program that asks the user to enter an object's mass, and 
 * then calculate its weight. If the object weighs more than 1000
 * Newtons, display a message indicating that it is too heavy. If the 
 * object weighs less than 10 Newtons, display a message indicating 
 * that the object is too light. 
 */

public class Challenge_05 
{
    public static void main(String[] args)
    {
        String input;           // Needed for user input
        double weight, mass;    // Needed for the formula
        
        input = JOptionPane.showInputDialog(null, "Please enter " +
                    "the mass in kilograms of the object:");
        mass = Double.parseDouble(input);

        // Calculate
        weight = mass * 9.8;
        
        if (weight > 1000)
            JOptionPane.showMessageDialog(null, "The Newton weight " +
                        "is over 1000.");
        else if (weight < 10)
            JOptionPane.showMessageDialog(null, "The Newton weight " +
                        " is under 10.");
        else 
            JOptionPane.showMessageDialog(null, "The Newton weight " +
                        "of the object is " + weight + " Newtons.");
    }
}
