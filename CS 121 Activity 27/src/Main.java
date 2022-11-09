/*
 *******************************************************************
 * Activity 27
 * Name: Nicholas Newlin
 * Date of Submission (11/08/2022)
 * CS 121 Data Structures and Objects
 ******************** Program Documentation ************************
 *
 *
 *
 *
 *******************************************************************
 */
public class Main
{
    public static void main (String [] args)
    {
        Sorting sorting = new Sorting();

        int[] unsortedArray = sorting.getArray();
        System.out.printf("%-20s","Unsorted Array:");
        for (int element : unsortedArray)
        {
            System.out.print(element + "\t");
        }

        System.out.println();

        int[] sortedArray = sorting.sortArray(unsortedArray);
        System.out.printf("%-20s","Sorted Array:");
        for (int element : sortedArray)
        {
            System.out.print(element + "\t");
        }
    }
}
