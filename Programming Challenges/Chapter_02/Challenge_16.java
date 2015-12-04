/*
Daniel Gail
12/3/15

Chapter 2
Programming Challenge 16
 */

import java.util.Scanner;       // Calls the Scanner class

/**     Word Game
 * Write a program that plays a word game with the user. The program should
 * ask the user to enter the following:
 *      His or her name
 *      His or her age
 *      The name of a city
 *      The name of a college
 *      A profession
 *      A type of animal
 *      A pet's name
 * After the user has entered these items, the program should display
 * the following story, inserting the user's input into the appropriate
 * locations:
 *      There once was a person named NAME who lived in CITY. At the age
 *      of AGE, NAME went to college at COLLEGE. NAME graduated and went
 *      to work as a PROFESSION. Then, NAME adopted a(n) ANIMAL named 
 *      PETNAME. They both lived happily ever after!
 */

public class Challenge_16 
{
    public static void main(String[] args)
    {
        // Variables for this program
        String name, city, age, college, profession, animal, petName;
        Scanner keyboard = new Scanner(System.in); // Needed for input
        
        // Get needed input from user
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        
        System.out.print("Please enter your age: ");
        age = keyboard.nextLine();
        
        System.out.print("Please enter a city: ");
        city = keyboard.nextLine();
        
        System.out.print("Please enter the name of a college: ");
        college = keyboard.nextLine();
        
        System.out.print("Please enter a profession: ");
        profession = keyboard.nextLine();
        
        System.out.print("Please enter a type of animal: ");
        animal = keyboard.nextLine();
        
        System.out.print("Please enter in the name of this animal: ");
        petName = keyboard.nextLine();
        
        // Output as requested
        System.out.println("\nThere once was a person named " +
                name + " who lived in " + city + ".\nAt the age of " + age +
                ", " + name + " went to college at " + college + ".\n" +
                name + " graduated and went to work as a " + profession +
                ".\nThen, " + name + " adopted a(n) " + animal + " named " +
                petName +".\nThey both lived happily ever after!");
        
        
    }
}
