/*
Daniel Gail
12/9/15

Chapter 3
Programming Challenge 3
 */

import java.util.Scanner;       // Needed for user input

/**     Body Mass Index
 * Write a program that calculates and displays a person's body mass
 * index (BMI). The BMI is often used to determine whether a person with
 * a sedentary lifestyle is overweight or under-weight for his or her 
 * height. A person's BMI is calculated with the following formula:
 *      BMI = weight x 703 / height(sq)
 * where weight is measured in pounds and height is measured in inches.
 * The program should display a message indicating whether the person 
 * has optimal weight, is underweight, or is overweight. A sedentary 
 * person's weight is considered optimal if his or her BMI is between
 * 18.5 and 25. If the BMI is less than 18.5, the person is considered
 * underweight. If the BMI value is greater than 25, the person is 
 * considered overweight.
 */

public class Challenge_03 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double weight, height;          // Variables for user input
        double bmi;                     // BMI variable
        
        // Gather the input
        System.out.println("We will now calculate your BMI.");
        System.out.print("Please enter in your weight in pounds: ");
        weight = keyboard.nextDouble();
        
        System.out.print("Please enter in your height in inches: ");
        height = keyboard.nextDouble();
        
        // Calculate the BMI of the user
        bmi = (weight * (703 / (height * height)));
        
        if (bmi < 18.5)
            System.out.println("You are currently underweight with " +
                        "a BMI of: " + bmi);
        else if (bmi >25)
            System.out.println("You are currently overweight with a " +
                        "BMI of: " + bmi);
        else
            System.out.println("You are at a normal weight with a " +
                    "BMI of: " + bmi);
    }
}
