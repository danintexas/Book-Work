/*
Daniel Gail
12/3/15

Chapter 2
Programming Challenge 15
 */

/**     Energy Drink Consumption
 * A soft drink company recently surveyed 12,467 of its customers 
 * and found that approximately 14 percent of those surveyed purchase
 * one of more energy drinks per week. Of those customers who purchase
 * energy drinks, approximately 64 percent of them prefer citrus-flavored
 * energy drinks. Write a program that displays the following:
 *      The approximate number of customers in the survey who purchase
 *          one or more energy drinks per week
 *      The approximate number of customers in the survey who prefer
 *          citrus-flavored energy drinks
 */

public class Challenge_15 
{
    public static void main(String[] args)
    {
        // Variables needed
        int peopleSurveyed = 12467;
        Double moreThanOne = 0.14;
        Double preferCitrus = 0.64;
        
        // Display requested output
        System.out.println("\tEnergy drink consumption");
        System.out.println("Total number of people surveyed: " +
                            peopleSurveyed);
        System.out.println("Total number of people who drank more" +
                           " than one energy drink: " +
                           (int)(peopleSurveyed * moreThanOne));
        System.out.println("Total number of people who prefer citrus " +
                           "flavored energy drinks: " +
                           (int)(peopleSurveyed * preferCitrus));
        
    }
}
