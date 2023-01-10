package Sorting;

public class QuickSort
{
    //quick sort for an array of integers in ascending order
    public static void quickSort(int array[])
    {
        doQuickSort(array, 0, array.length - 1);
    }
    private static void doQuickSort(int array[], int start, int end)
    {
        int pivotPoint;

        if (start < end)
        {
            pivotPoint = partition(array, start, end);
            doQuickSort(array, start, pivotPoint - 1);
            doQuickSort(array, pivotPoint + 1, end);
        }
    }
    private static int partition(int array[], int start, int end)
    {
        int pivotValue;
        int endOfLeftList;
        int mid;

        mid = (start + end) / 2;
        swap(array, start, mid);
        pivotValue = array[start];
        endOfLeftList = start;

        for (int scan = start + 1; scan <=end; scan++)
        {
            if (array[scan] < pivotValue)
            {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }
        swap(array, start, endOfLeftList);
        return endOfLeftList;
    }
    private static void swap(int[] array, int a, int b)
    {
        int temp;

        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    //quicksort for an array of comparable objects in ascending order
}
