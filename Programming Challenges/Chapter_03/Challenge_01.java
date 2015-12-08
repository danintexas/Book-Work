/*
Daniel Gail
12/7/15

Chapter 3
Programming Challenge 1
 */

import java.util.Scanner;

/**     Roman Numerals
 * Write a program that prompts the user to enter a number within 
 * the range of 1 through 10. The program should display the Roman
 * numeral version of that number. If the number is outside the range 
 * of 1-10, the program should display an error. 
 */

public class Challenge_01 
{
    public static void main(String[] args)
    {
        int number;     // Number the user inputs
        Scanner keyboard = new Scanner(System.in); // Temp for input
        
        // Request the number
        System.out.print("Please enter in a number between 1 and 10: ");
        number = keyboard.nextInt();
        
        System.out.print("The Roman Numeral of your entered number is :");
        
        switch (number)
        {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Errr... wait. \n\n You need to " +
                        "enter a number between 1 and 10 please.");
                break;
        }
    }
}
