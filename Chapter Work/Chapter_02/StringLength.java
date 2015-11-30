/*
Daniel Gail
11/30/15

Chapter 2
Code Listing 2-21
 */

/**
 * This program demonstrates the String class's length method.
 */

public class StringLength 
{
    public static void main(String[] args)
    {
        String name = "Daniel Richard Gail";
        int stringSize;
        
        stringSize = name.length();
        System.out.println(name + " has " + stringSize +
                            " characters.");
    }
}
