/*
Daniel Gail
March 4, 2015

Chapter 9
Code Listing 9-10
*/

package Chapter_09;

/**
 * This program uses the Stock class's equals
 * method to compare two Stock objects.
 */

public class StockCompare 
{
    public static void main(String[] args)
    {
        // Create two Stock objects with the same values.
        Stock company1 = new Stock("XYZ", 9.62);
        Stock company2 = new Stock("XYZ", 9.62);
        
        // Use the equals method to compare the objects.
        if (company1.equals(company2))
            System.out.println("Both objects are the same.");
        else 
            System.out.println("The objects are different.");
    }
}
