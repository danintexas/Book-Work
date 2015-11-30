/*
Daniel Gail
11/30/15

Chapter 2
Code Listing 2-23
 */

/**
 * This program can't find its variable.
 */

public class Scope 
{
    public static void main(String[] args)
    {
        System.out.println(value);  // Error 
        int value = 100;
    }
}
