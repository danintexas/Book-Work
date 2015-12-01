/*
Daniel Gail
12/01/15

Chapter 2
Programming Challenge 6
 */

/**     Sales Prediction
 * The East Cost sales division of a company generates 62 percent of 
 * total sales. Based on that percentage, write a program that will
 * predict how much the East Coast division will generate if the 
 * company has $4.6 million in sales this year. 
 * Hint: Use the value 0.62 to represent 62 percent.
 */

public class Challenge_06 
{
    public static void main(String[] args)
    {
        // Initialize and set up my variables
        double eastCoastSalesPercent = 0.62;    // East Coast Sales Percent
        double totalCompanySales = 4600000;     // Total company sales
        double eastCoastSales =                 // Calulating Sales Figure
                totalCompanySales * eastCoastSalesPercent;
        
        // Print out the results to the screen
        System.out.println("Estimated East Coast Sales Percent: " +
                (eastCoastSalesPercent * 100) + "%\nTotal Company " +
                "Sales: $" + totalCompanySales +"\n\nEstimated East " +
                "Coast Sales: $" + eastCoastSales);
        
    }
}
