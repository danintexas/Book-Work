/*
Daniel Gail
Feb 15, 2015

Chapter 6
Code Listing 6-4

I started here because 6-1 through 6-4 were the same class
    just building up to 6-4. Understood the material so
    just started here. 
*/

public class Rectangle 
{
    private double length;
    private double width;
    
    /** 
     * The setLength method stores a value in the 
     * length field.
     * @param len The value to store in length.
     */
    
    public void setLength(double len)
    {
        length = len;
    }
    
    /**
     * The setWidth method stores a value in the
     * width field.
     * @param w The value to store in width.
     */
    
    public void setWidth(double w)
    {
        width = w;
    }
    
    /**
     * The getLength method returns a Rectangle
     * object's Length.
     * @return The value in the length field.
     */
    
    public double getLength()
    {
        return length;
    }
    
    /**
     * The getWidth method returns a Rectangle
     * object's width.
     * @return The value in the width field.
     */
    
    public double getWidth()
    {
        return width;
    }
    
    /**
     * The getArea method returns a Rectangle
     * object's area.
     * @return The product of length times width.
     */
    
    public double getArea()
    {
        return length * width;
    }
}