/*
Daniel Gail
12/8/15

Chapter 3
Programming Challenge 2
 */

import java.util.Scanner;       // Needed for input

/**     Magic Dates
 * The date June 10, 1960, is special because when we write it in 
 * the following format, the month times the day equals the year:
 *      6/10/60
 * Write a program that asks the user to enter a month (in numeric
 * form), a day, and a two-digit year. The program should then 
 * determine whether the month times the day is equal to the year.
 * If so, it should display a message saying the date is magic.
 * Otherwise it should display a message saying the date is not magic.
 */

public class Challenge_02 
{
    public static void main(String[] args)
    {
        int month, day, year;   
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter in a month using a two digit " +
                    "number: ");
        month = keyboard.nextInt();
        
        System.out.print("Please enter in a day using a two digit " +
                    "number: ");
        day = keyboard.nextInt();
        
        System.out.print("Please enter in a year using a two digit " +
                    "number: ");
        year = keyboard.nextInt();
        
        System.out.println("Date entered was: " + month + "/" + day + 
                    "/" + year);
        
        if (year == month * day)
            System.out.println("That is a magic date!");
        else 
            System.out.println("That date is not magic.");
    }
}
