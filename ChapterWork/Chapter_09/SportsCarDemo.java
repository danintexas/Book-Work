/*
Daniel Gail
March 7, 2014

Chapter 9
Code Listing 9-22
*/

/**
 * This program demonstrates the SportsCar class.
 */

public class SportsCarDemo 
{
    public static void main(String[] args)
    {
        // Create a SportsCar object.
        SportsCar yourNewCar = new SportsCar(CarType.PORSCHE,
                                    CarColor.RED, 100000);
        
        // Display the object's values.
        System.out.println(yourNewCar);
    }
}
