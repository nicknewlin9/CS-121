package Sorting;

public class SelectionSort
{
    //selection sort for an array of integers in ascending order
    public static void selectionSort(int[] array)
    {
        int startScan;
        int index;
        int minIndex;
        int minValue;

        for (startScan = 0; startScan < (array.length); startScan++)
        {
            minIndex = startScan;
            minValue = array[startScan];
            for(index = startScan + 1; index < array.length; index++)
            {
                if (array[index] < minValue)
                {
                    minValue = array[index];
                    minIndex = index;
                }
            }
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }
    //selection sort for an array of comparable objects in ascending order
    public static void comparableSelectionSort(Comparable[] array)
    {
       int startScan;
       int index;
       int minIndex;
       Comparable minValue;

       for (startScan = 0; startScan < (array.length-1); startScan++)
       {
          minIndex = startScan;
          minValue = array[startScan];
          for(index = startScan + 1; index < array.length; index++)
          {
             if (array[index].compareTo(minValue) < 0)
             {
                minValue = array[index];
                minIndex = index;
             }
          }
          array[minIndex] = array[startScan];
          array[startScan] = minValue;
       }
    }
}
