/*
Daniel Gail
12/14/15

Chapter 3
Programming Challenge 7
 */

/**     Sorted Names
 * Write a program that asks the user to enter three names, and then
 * displays the names sorted in ascending order. For example, if the 
 * user entered "Charlie", "Leslie", and "Andy", the program would 
 * display:
 *      Andy
 *      Charlie
 *      Leslie
 */

import javax.swing.JOptionPane;     // Needed for JOptionPane

public class Challenge_07 
{
    public static void main(String[] args)
    {
        // Variables needed
        String input, nameOne, nameTwo, nameThree;
        
        // Gather the input needed
        input = JOptionPane.showInputDialog(null, "Please enter " +
                "the first name: ");
        nameOne = input;
        
        input = JOptionPane.showInputDialog(null, "Please enter " +
                "the second name: ");
        nameTwo = input;
        
        input = JOptionPane.showInputDialog(null, "Please enter " +
                "the third name: ");
        nameThree = input;
        
        // Sorting tree
        if (nameOne.compareTo(nameTwo) < 0)
        {
            if (nameOne.compareTo(nameThree) < 0)
            {
                if (nameThree.compareTo(nameTwo) < 0)
                    JOptionPane.showMessageDialog(null, "The order " +
                            "of the names are:\n" + nameOne + "\n" +
                            nameThree + "\n" + nameTwo);
                
                else
                    JOptionPane.showMessageDialog(null, "The order" +
                            "of the names are:\n" + nameOne + "\n" +
                            nameTwo + "\n" + nameThree);
            }
            
            else
                JOptionPane.showMessageDialog(null, "The order" +
                        "of the names are:\n" + nameThree + "\n" + 
                        nameOne + "\n" + nameTwo);
        }
        
        else
        {
            if (nameTwo.compareTo(nameThree) < 0)
            {
                if (nameThree.compareTo(nameOne) < 0)
                    JOptionPane.showMessageDialog(null, "The order" +
                            "of the names are:\n" + nameTwo + "\n" +
                            nameThree + "\n" + nameOne);
                else
                    JOptionPane.showMessageDialog(null, "The order" +
                            "of the names are:\n" + nameTwo + "\n" + 
                            nameOne + "\n" + nameThree);
            }
            
            else
                JOptionPane.showMessageDialog(null, "The order" +
                        "of the names are:\n" + nameThree + "\n" +
                        nameTwo + "\n" + nameOne);
        }
        
        System.exit(0);
    }
}
