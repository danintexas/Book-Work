/*
Daniel Gail
12/02/15

Chapter 2
Programming Challenge 7
 */

/**     Land Calculation
 * One acre of land is equivalent to 43,560 square feet. Write a program 
 * that calculates the number of acres in a tract of land with 389,767 
 * square feet.
 */

public class Challenge_07 
{
    public static void main(String[] args)
    {
        // Set up the variables I need
        double acre = 43560, totalArea = 389767;
        
        // Calculate
        double numberOfAcres = totalArea / acre;
        
        // Display results
        System.out.println("The total area of the land is: " +
                            totalArea + "\nThe number of acres " +
                            "in this tract of land is: " +
                            numberOfAcres);
    }
}
