/*
Daniel Gail
12/4/15

Chapter 2
Programming Challenge 17
 */

/**     Stock Transaction Program
 * Last month Joe purchased some stock in Acme Software, Inc. Here
 * are the details of the purchase:
 *      The number of shares that Joe purchased was 1,000.
 *      When Joe purchased the stock, he paid $32.87 per share.
 *      Joe paid his stockbroker a commission that amounted to 2% of the
 *          amount he paid for the stock.
 * Two weeks later Joe sold the stock. Here are the details of the sale:
 *      The number of shares that Joe sold was 1,000.
 *      He sold the stock for $33.92 per share.
 *      He paid his stockbroker another commission that amounted to 2%
 *          of the amount he received for the stock.
 * Write a program that displays the following information:
 *      The amount of money Joe paid for the stock.
 *      The amount of commission Joe paid his broker when he 
 *          bought the stock.
 *      The amount that Joe sold the stock for.
 *      The amount of commission Joe paid his broker when he sold the 
 *          stock.
 *      Display the amount of profit that Joe made after selling his
 *          stock and paying the two commissions to his broker. (If
 *          the amount of profit that your program displays is a negative
 *          number, then Joe lost money on the transaction.)
 */

public class Challenge_17 
{
    public static void main(String[] args)
    {
        // Set up the variables needed
        int shares = 1000;          // Number of shares bought and sold
        double stockBought = 32.87, stockSold = 33.92; 
        double priceBought, priceSold;
        double totalBought, totalSold;
        double commissionBought, commissionSold;   
        double commissionRate = 0.02;
        double profit, commissionTotal;
        
        // Perform calculations for the price before commission
        priceBought = shares * stockBought;
        priceSold = shares * stockSold;
        
        // Perform calculations for the commission
        commissionBought = priceBought * commissionRate;
        commissionSold = priceSold * commissionRate;
        commissionTotal = commissionBought + commissionSold;
        
        // Perform calculations for totals after commission
        totalBought = priceBought - commissionBought;
        totalSold = priceSold - commissionSold;
        profit = (totalSold - totalBought) - commissionTotal;
        
        // Output all results
        System.out.println("1000 shares of Acme Software Inc. were " +
                "purchased for $" + stockBought + " each.");
        System.out.println("Total cost to the buyer: $" + priceBought);
        System.out.println("The stockbroker made a 2% commission " +
                "off this trade which was: $" + commissionBought);
        
        System.out.println("\nThe stock was sold two weeks later for" +
                " $" + stockSold + " a share.");
        System.out.println("Total payout to the buyer: $" +
                totalSold);
        System.out.println("The stockbroker made a 2% commission " +
                "off this trade which was: $" + commissionSold);
        
        System.out.println("\nThe total profit on this deal for the " +
                "customer was: $" + profit);
        System.out.println("The total amount made by the stockbroker " +
                "was: $" + commissionTotal);
        
        System.out.println("\nSo make sure you be a stockbroker!");
    }
}
