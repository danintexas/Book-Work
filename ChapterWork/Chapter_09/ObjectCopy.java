/*
Daniel Gail
March 4, 2015

Chapter 9
Code Listing 9-11
*/

package Chapter_09;

/**
 * This program uses the Stock class's copy method
 * to create a copy of a Stock object.
 */

public class ObjectCopy 
{
    public static void main(String[] args)
    {
        // Create Stock object.
        Stock company1 = new Stock("XYZ", 9.62);
        
        // Declare a Stoc variable
        Stock company2; 
        
        // Make company2 reference a cpy of the object
        // referenced by company1.
        company2 = company1.copy();
        
        // Display the contents of both objects.
        System.out.println("Company 1:\n" + company1);
        System.out.println();
        System.out.println("Company 2:\n" + company2);
        
        // Confirm that we actually have two objects. 
        if (company1 == company2)
        {
            System.out.println("The company1 and company2 " +
                    "variables reference the same object.");
        }
        else 
        {
            System.out.println("The company1 and company2 " +
                    "variables reference different objects.");
        }
    }
}