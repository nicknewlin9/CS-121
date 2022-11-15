package Sorting;

public class BubbleSort
{
    //bubble sort for an array of integers in ascending order
    public static void bubbleSort(int[] array)
    {
       int lastPos;
       int index;
       int temp;

       for (lastPos = array.length - 1; lastPos >= 0; lastPos--)
       {
          for (index = 0; index <= lastPos - 1; index++)
          {
             if (array[index] > array[index + 1])
             {
                temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
             }
          }
       }
    }
    //bubble sort for an array of comparable objects in ascending order
    public static void comparableBubbleSort(Comparable[] array)
    {
       int lastPos;
       int index;
       Comparable temp;

       for (lastPos = array.length - 1; lastPos >= 0; lastPos--)
       {
          for (index = 0; index <= lastPos - 1; index++)
          {
             if (array[index].compareTo(array[index + 1]) > 0)
             {
                temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
             }
          }
       }
    }
}
