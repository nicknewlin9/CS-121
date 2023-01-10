package Sorting;

public class SequentialSearch
{
    //sequential search for an array of integers
    public static int sequentialSearch(int[] array, int value)
    {
       int index;
       int position;
       boolean found;

       index = 0;
       position = -1;
       found = false;

       while (!found && index < array.length)
       {
          if (array[index] == value)
          {
             found = true;
             position = index;
          }
          index++;
       }
       return position;
    }
}
