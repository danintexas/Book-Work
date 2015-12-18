/*
Daniel Gail
12/18/15

Chapter 3
Programming Challenge 12
 */

/**     The Speed of Sound
 * The following table shows the approximate speed of sound in air, water,
 * and steel:
 *          Medium              Speed
 *      Air                 1100 feet per second
 *      Water               4900 feet per second
 *      Steel               16,400 feet per second
 * 
 * Write a program that asks the user to enter "air", "water", or "steel",
 * and the distance that a sound wave will travel in the medium. The 
 * program should then display the amount of time it will take. 
 * 
 * You can calculate the amount of time it takes sound to travel in air 
 * with the following formula:
 *      Time = distance / 1100
 * You can calculate the amount of time it takes sound to travel in water
 * with the following formula:
 *      Time = distance / 4900
 * You can calculate the amount of time it takes sound to travel in steel 
 * with the following formula:
 *      Time = distance / 16400
 */

import java.util.Scanner;

public class Challenge_12 
{
    public static void main(String[] args)
    {
        // Variables needed
        Scanner input = new Scanner(System.in);
        String type;
        double distance, time = 0;
        
        // Request the input needed
        System.out.print("Please enter in the distance: ");
        distance = input.nextDouble();
        
        input.nextLine();
        
        System.out.print("Please enter in the type of substance " +
                "the sound is going through:" + "\n'Air' 'Water'" +
                "'Steel'\n");
        type = input.nextLine();       
        
        if (type.equalsIgnoreCase("air"))
        {
            time = distance / 1100;
        
            System.out.println("The time in seconds for sound to travel " +
                "through " + type + " is: " + time + " seconds.");
        }
        
        else if (type.equalsIgnoreCase("water"))
        {
            time = distance / 4900;
            System.out.println("The time in seconds for sound to travel " +
                "through " + type + " is: " + time + " seconds.");
        }
        
        else if (type.equalsIgnoreCase("steel"))
        {   
            time = distance / 16400;
            System.out.println("The time in seconds for sound to travel " +
                "through " + type + " is: " + time + " seconds.");
        }
        
        else
            System.out.println("Please enter a valid type.");
    }
}
