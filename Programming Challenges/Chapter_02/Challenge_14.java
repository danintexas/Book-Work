/*
Daniel Gail
12/3/15

Chapter 2
Programming Challenge 14
 */

/**     Stock Commission
 * Kathryn bought 600 shares of stock at a price of $21.77 per share. She
 * must pay her stockbroker a 2 percent commission for the transaction.
 * Write a program that calculates and displays the following:
 *      The amount paid for the stock alone (without the commission)
 *      The amount of the commission
 *      The total amount paid (for the stock plus the commission)
 */

public class Challenge_14 
{
    public static void main(String[] args)
    {
        // Set up the variables
        double shares = 600;            // Number of shares
        double shareCost = 21.77;       // Cost of each share when bought
        double commissionRate = .02;        // 2% commission to broker
        double noCommission = shares * shareCost; // Cost before
                                                  // commission
        double commission = noCommission * commissionRate;
        double totalCost = noCommission + commission; // Purchase total
        
        // Output requested
        System.out.println("Total Shares: " + shares + "\nBought at: $" +
                shareCost + " each.");
        System.out.println("The total purchase price of the stock " +
                "before commission: " + noCommission);
        System.out.println("The commission on this transaction was: $" +
                commission);
        System.out.println("Total purchase price: $" + totalCost);
    }
}
