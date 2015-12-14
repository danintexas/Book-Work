/*
Daniel Gail
12/13/15

Chapter 3
Programming Challenge 6
 */

/**     Time Calculator
 * Write a program that asks the user to enter a number of seconds. 
 *  There are 60 seconds in a minute. If the number of seconds entered
 *      by the user is greater than or equal to 60, the program should 
 *      display the number of minutes in that many seconds. 
 *  There are 3600 seconds in an hour. If the number of seconds entered
 *      by the user is greater than or equal to 3600, the program should
 *      display the number of hours in that many seconds. 
 *  There are 86400 seconds in a day. If the number of seconds entered 
 *      by the user is greater than or equal to 86400, the program should
 *      display the number of days in that many seconds.
 */

import javax.swing.JOptionPane;       // Needed for JOptionPane class

public class Challenge_06 
{
    public static void main(String[] args)
    {
        // Variables needed
        int seconds = 0, minutes = 0, hours = 0, days= 0;  
        String input;
        
        input = JOptionPane.showInputDialog(null,"Please enter " +
                    "the number of seconds to calculate");
        seconds = Integer.parseInt(input);
        
        if (seconds >= 86400)
        {
            days = seconds / 86400;
            seconds = seconds % 86400;
            
            if (seconds >= 3600)
            {
                hours = seconds / 3600;
                seconds = seconds % 3600;
                
                if (seconds >= 60)
                {
                    minutes = seconds / 60;
                    seconds = seconds % 60;
                    
                    JOptionPane.showMessageDialog(null, "Days: " + 
                            days + " Hours: " + hours + " Seconds: " +
                            seconds);
                }
                
                else 
                    JOptionPane.showMessageDialog(null, "Days: " +
                            days + " Hours: " + hours + " Seconds: " +
                            seconds);
            }
            else 
                JOptionPane.showMessageDialog(null, "Days: " + days +
                        " Hours: " + hours + " Seconds: " + seconds);
        }
        
        else
        {
            if (seconds >= 3600)
            {
                hours = seconds / 3600;
                seconds = seconds % 3600;
                
                if (seconds >= 60)
                {
                    minutes = seconds / 60;
                    seconds = seconds % 60;
                    
                    JOptionPane.showMessageDialog(null, "Days: " + 
                            days + " Hours: " + hours + " Seconds: " +
                            seconds);
                }
                
                else 
                    JOptionPane.showMessageDialog(null, "Days: " +
                            days + " Hours: " + hours + " Seconds: " +
                            seconds);
            }
            else 
                JOptionPane.showMessageDialog(null, "Days: " + days +
                        " Hours: " + hours + " Seconds: " + seconds);
        }
        
        System.exit(0);
    }
}
