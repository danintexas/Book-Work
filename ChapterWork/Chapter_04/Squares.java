/*
Daniel Gail
May 25, 2015

Chapter 4
Code Listing 4-7
*/

/**
 * This program demonstrates the for loop.
 */

public class Squares 
{
    public static void main(String[] args)
    {
        int number;     // Loop control variable
        
        System.out.println("Number      Number Squared");
        System.out.println("--------------------------");
        
        for (number = 1; number <= 10; number++)
        {
            System.out.println("   " + number + "  \t\t" +
                                number * number);
        }
    }
}
