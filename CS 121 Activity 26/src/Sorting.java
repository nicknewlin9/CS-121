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
    //bubble sort in ascending order
    public int[] sortArray(int[] array)
    {
        int temp;
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int index = 0; index < array.length - i - 1; index++)
            {
                if (array[index] > array[index + 1])
                {
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;
    }
}
