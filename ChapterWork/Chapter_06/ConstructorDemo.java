/*
Daniel Gail
Feb 15, 2015

Chapter 6
Code Listing 6-10
*/

/*
    This program demonstrates the Rectangle class's
    constructor.
 */

public class ConstructorDemo 
{
    public static void main(String[] args)
    {
        // Create a Rectangle object, passing 5.0 and
        // 15.0 as arguments t the constructor.
        Rectangle2 box = new Rectangle2(5.0, 15.0);
        
        // Display the length.
        System.out.println("The box's length is " +
                box.getLength());
        
        // Display the width.
        System.out.println("The box's width is " +
                box.getWidth());
        
        // Display the area.
        System.out.println("The box's area is " +
                box.getArea());
    }
}
