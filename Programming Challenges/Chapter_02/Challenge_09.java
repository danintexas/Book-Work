/*
Daniel Gail
12/2/15

Chapter 2
Programming Challenge 9
 */

import java.util.Scanner;       // Calls up the Scanner class

/**     Miles-per-Gallon
 *A car's miles-per-gallon (MPG) can be calculated with the 
 * following formula:
 *          MPG = Miles driven / Gallons of gas used
 * Write a program that asks the user for the number of miles driven
 * and the gallons of gas used. It should calculate the car's 
 * miles-per-gallon and display the result on the screen.
 */

public class Challenge_09 
{
    public static void main(String[] args)
    {
        // Set up all the variables
        double miles;       // Miles driven entered by the user
        double gallons;     // Gallons used enetered by the user
        double mpg;         // Miles per gallon
        Scanner keyboard = new Scanner(System.in); // Input variable
        
        // Gather the input
        System.out.print("Miles driven: ");
        miles = keyboard.nextDouble();
        
        System.out.print("Gallons used: ");
        gallons = keyboard.nextDouble();
        
        // Calculation of the results
        mpg = miles / gallons;
        
        // Output results
        System.out.println("Total miles driven: " + miles + "\nTotal " +
                "gallons used: " + gallons + "\nAverage MPG: " + mpg);
    }
}
