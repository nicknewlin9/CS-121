package Sorting;

public class BinarySearch
{
    //binary search for an array of integers using iteration
    public static int iterativeBinarySearch(int[] array, int value)
    {
        int middle;
        int first = 0;
        int last = array.length - 1;
        int position = -1;
        boolean found = false;

        while (!found && first <= last)
        {
            middle = (first + last) / 2;
            if (array[middle] == value)
            {
                found = true;
                position = middle;
            }
            else if (array[middle] > value)
                last = middle - 1;
            else
                first = middle + 1;
        }
        return position;
    }
    //binary search for an array of integers using recursion
    public static int recursiveBinarySearch(int[] array, int first, int last, int value)
    {
        int middle;

        if (first > last)
            return -1;

        middle = (first + last) / 2;

        if (array[middle] == value)
            return middle;
        else if (array[middle] < value)
            return recursiveBinarySearch(array, middle + 1, last, value);
        else
            return recursiveBinarySearch(array, first,middle - 1, value);
    }
}
