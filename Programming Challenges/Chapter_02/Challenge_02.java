/*
Daniel Gail
12/01/15

Chapter 2
Programming Challenge 2
 */

/**     Name and Initials
 * Write a program that has the following String variables:
 * firstName, middleName, and lastName. Initialize these
 * with your first, middle, and last names. The program should also
 * have the following char variables: firstInitial, middleInitial, and
 * lastInitial. Store your first, middle, and last initials in these 
 * variables. The program should display the contents of these variables
 * on the screen.
 */

public class Challenge_02 
{
    public static void main(String[] args)
    {
        // String variables requested
        String firstName = "Daniel", middleName = "Richard",
                lastName = "Gail";
        
        // char variables requested
        char firstInitial = 'D', middleInitial = 'R',
                lastInitial = 'G';
        
        // Print out all the information
        System.out.println("My full name is: " + firstName + " " +
                middleName + " " + lastName);
        System.out.println("My initials are: " + firstInitial + 
                middleInitial + lastInitial);
    }
}
