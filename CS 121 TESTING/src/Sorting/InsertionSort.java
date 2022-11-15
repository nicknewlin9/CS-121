package Sorting;

public class InsertionSort
{
    //insertion sort for an array of integers in ascending order
    public static void insertionSort(int[] array)
    {
       int unsortedValue;
       int scan;

       for (int index = 1; index < array.length; index++)
       {
          unsortedValue = array[index];
          scan = index;
          while (scan > 0 && array[scan - 1] > unsortedValue)
          {
             array[scan] = array[scan-1];
             scan--;
          }
          array[scan] = unsortedValue;
       }
    }
    //insertion sort for an array of comparable objects in ascending order
}
