/*
Daniel Gail
12/16/15

Chapter 3
Programming Challenge 10
 */

/**     Fat Gram Calculator
 * Write a program that asks the user to enter the number of calories
 * and fat grams in a food item. The program should display the percentage
 * of the calories that come from fat. One gram of fat has 9 calories, 
 * therefore:
 *      Calories from fat = fat grams * 9
 * The percentage of calories from fat can be calculated as follows:
 *      Calories from fat / total calories
 * If the calories from fat are less than 30 percent of the total calories
 * of the food, it should also display a message indicating the food is 
 * low in fat.
 */

import javax.swing.JOptionPane;         // Needed for JOptionPane

public class Challenge_10 
{
    public static void main(String[] args)
    {
        // Set up variables needed
        String input;       
        double totalCalories, fatGrams, fatCalories, fatPercent;
        
        // Gather needed input from the user
        input = JOptionPane.showInputDialog(null, "Please enter in " +
                "the total calories of the food to be analyzed:");
        totalCalories = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(null, "Please enter in " +
                "the total fat grams of the food to be analyzed:");
        fatGrams = Double.parseDouble(input);
        
        fatCalories = fatGrams * 9;
        fatPercent = (fatCalories / totalCalories) * 100;
        
        if (fatCalories <= totalCalories)
        {
            JOptionPane.showMessageDialog(null, "The percentage of " +
                "fat in this food is: " + fatPercent + "%");
        
            if (fatPercent < 30)
                JOptionPane.showMessageDialog(null, "This food is " +
                    "low fat.");
        }
        
        else
            JOptionPane.showMessageDialog(null, "ERROR: The total " +
                    "fat calories can not exceed the total calories " +
                    "of the food item.");
        
        System.exit(0);
    }
}
