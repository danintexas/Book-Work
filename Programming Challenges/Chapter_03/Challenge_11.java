/*
Daniel Gail
12/17/15

Chapter 3
Programming Challenge 11
 */

/**     Running the Race
 * Write a program that asks for the names of three runners and the time,
 * in minutes, it took each of them to finish a race. The program should
 * display the names of the runners in the order that they finished.
 */

import javax.swing.JOptionPane;         // For JOptionPane

public class Challenge_11 
{
    public static void main(String[] args)
    {
        // Set up and declare all variables needed
        String input, runnerOne, runnerTwo, runnerThree;
        double runTimeOne, runTimeTwo, runTimeThree;
        
        // Gather the name and time for runner #1
        input = JOptionPane.showInputDialog(null, "Please enter in " +
                "the name of the first runner:");
        runnerOne = input;
        
        input = JOptionPane.showInputDialog(null, "Please enter in " +
                "the time of the first runner (in minutes):");
        runTimeOne = Double.parseDouble(input);
        
        // Gather the name and time for runner #2
        input = JOptionPane.showInputDialog(null, "Please enter in " +
                "the name of the second runner:");
        runnerTwo = input;
        
        input = JOptionPane.showInputDialog(null, "Please enter in " +
                "the time of the second runner (in minutes):");
        runTimeTwo = Double.parseDouble(input);
        
        // Gather the name and time for runner #3
        input = JOptionPane.showInputDialog(null, "Please enter in " +
                "the name of the third runner:");
        runnerThree = input;
        
        input = JOptionPane.showInputDialog(null, "Please enter in " +
                "the time of the third runner (in minutes):");
        runTimeThree = Double.parseDouble(input);
        
        if (runTimeOne < runTimeTwo)
        {
            if (runTimeOne < runTimeThree)
            {
                if (runTimeThree < runTimeTwo)
                    JOptionPane.showMessageDialog(null, "The runners " +
                            "finished as such:\n" + runnerOne + "    " +
                            runTimeOne + "\n" + runnerThree + "    " +
                            runTimeThree + "\n" + runnerTwo + "    " +
                            runTimeTwo);
                
                else
                    JOptionPane.showMessageDialog(null, "The runners " +
                            "finished as such:\n" + runnerOne + "    " +
                            runTimeOne + "\n" + runnerTwo + "    " +
                            runTimeTwo + "\n" + runnerThree + "    " +
                            runTimeThree);
            }
            
            else
                JOptionPane.showMessageDialog(null, "The runners " +
                            "finished as such:\n" + runnerThree + "    " +
                            runTimeThree + "\n" + runnerOne + "    " +
                            runTimeOne + "\n" + runnerTwo + "    " +
                            runTimeTwo);
        }
        
        else
        {
            if (runTimeTwo < runTimeThree)
            {
                if (runTimeThree < runTimeOne)
                    JOptionPane.showMessageDialog(null, "The runners " +
                            "finished as such:\n" + runnerTwo + "    " +
                            runTimeTwo + "\n" + runnerThree + "    " +
                            runTimeThree + "\n" + runnerOne + "    " +
                            runTimeOne);
                
                else
                    JOptionPane.showMessageDialog(null, "The runners " +
                            "finished as such:\n" + runnerTwo + "    " +
                            runTimeTwo + "\n" + runnerOne + "    " +
                            runTimeOne + "\n" + runnerThree + "    " +
                            runTimeThree);
            }
            
            else 
                JOptionPane.showMessageDialog(null, "The runners " +
                            "finished as such:\n" + runnerThree + "    " +
                            runTimeThree + "\n" + runnerTwo + "    " +
                            runTimeTwo + "\n" + runnerOne + "    " +
                            runTimeOne);
        }
        
        System.exit(0);
    }
}
