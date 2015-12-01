/*
Daniel Gail
12/01/15

Chapter 2
Programming Challenge 5
 */

/**     Sum of Two Numbers
 * Write a program that stores the integers 62 and 99 in variables, 
 * and stores their sum in a variable named total.
 */

public class Challenge_05 
{
    public static void main(String[] args)
    {
        // Store the two numbers and initialize my variables
        int one = 62, two = 99, sum;
        
        // Calculate the sum
        sum = one + two;
        
        // Print the result
        System.out.println("The total of " + one + " and " + two +
                " is: " + sum);
    }
}
