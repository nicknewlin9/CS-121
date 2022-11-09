import java.util.Scanner;
public class Sorting
{
    public int[] getArray()
    {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];
        System.out.print("Enter integer 1: \n");
        array[0] = scanner.nextInt();
        System.out.print("Enter integer 2: \n");
        array[1] = scanner.nextInt();
        System.out.print("Enter integer 3: \n");
        array[2] = scanner.nextInt();
        System.out.print("Enter integer 4: \n");
        array[3] = scanner.nextInt();
        System.out.print("Enter integer 5: \n");
        array[4] = scanner.nextInt();
        return array;
    }

    //selection sort
    public int[] sortArray(int[] array)
    {
        for (int i = 0; i < array.length ; i++)
        {
            int min = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < array[min])
                {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }
}