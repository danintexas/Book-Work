/*
Daniel Gail
March 22, 2015

Chapter 11
Code Listing 11-29
*/

/**
 * Relatable interface
 */
public interface Relatable 
{
    boolean equals(GradedActivity g);
    boolean isGreater(GradedActivity g);
    boolean isLess(GradedActivity g);
}
