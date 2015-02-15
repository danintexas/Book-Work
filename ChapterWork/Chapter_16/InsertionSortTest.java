/**
 * Daniel Gail
 * Feb 8, 2015
 * 
 * Chapter 16
 * Code Listing 16-10
 */

/**
 * This program tests the insertionSort method in the 
 * IntInsertionSorter class.
 */

public class InsertionSortTest 
{
    public static void main(String[] args)
    {
        // Create an int array with test values.
        int[] values = { 5, 1, 3, 6, 4, 2 };
        
        // Display the array's contents.
        System.out.println("Original order: ");
        for (int element : values)
            System.out.print(element + " ");
        
        // Sort the array.
        IntInsertSorter.insertionSort(values);
        
        // Display the array's contents
        System.out.println("\nSorted order: ");
        for (int element : values)
            System.out.print(element + " ");
        
        System.out.println();
    }
}
