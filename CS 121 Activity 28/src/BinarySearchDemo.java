import java.util.ArrayList;
public class BinarySearchDemo
{
    public int binarySearch(int key,ArrayList<Integer> array)
    {
        int counter = 0;
        int low = 0;
        int high = array.length -1;
        int mid = (low + high) / 2;

        System.out.printf("comparison %d:\t", ++counter);

        for (int n: array)
            System.out.print(n + " ");

        System.out.printf("\n\tLow index: %d (%d)\tMid index: %d (%d)\tHigh index: %d (%d)\n\n",
                low, array[low], mid, array[mid], high, array[high]);

        while (low <= high && array[mid] != key)
        {
            if (array[mid] < key)
                low = mid + 1;
            else
                high = mid -1;
            mid = (low + high) / 2;
            for (int i = low; i <= high; i++)
                System.out.print(array[i] + " ");
            System.out.printf("\n\tLow index: %d (%d)\tMid index: %d (%d)\nHigh index: %d (%d)\n\n",
                    low, array[low], mid, array[mid], high, array[high]);
        }
        if (low > high)
            mid = -1;
        return mid;
    }
}