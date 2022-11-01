public class BigO
{
    public void printOnce(String string)
    {
        System.out.println(string);
    }

    public void printNTimes(int number)
    {
        for (int x = 0; x < number; x++)
        {
            System.out.printf("This code executed %d times\n",x+1);
        }
    }

    public void printNSquaredTimes(int number)
    {
        int n = 1;
        for (int x = 0; x < number; x++)
        {
            for (int y = 0; y < number; y++)
            {
                System.out.printf("This code executed %d times\n",n);
                n++;
            }
        }
    }
}