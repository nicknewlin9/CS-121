/*
*******************************************************************
* Practice Program
* Name: Nicholas Newlin
* Date of Submission ()
* CS 121 Data Structures and Objects
******************** Program Documentation ************************
*
*
*
*
*******************************************************************
*/
public class PRACTICE
{
    public static void main(String[] args)
    {
        System.out.println("ackermann (0,0) =  "+ ackermann(0,0));
        System.out.println("ackermann (0,1) =  "+ ackermann(0,1));
        System.out.println("ackermann (1,1) =  "+ ackermann(1,1));
        System.out.println("ackermann (1,2) =  "+ ackermann(1,2));
        System.out.println("ackermann (1,3) =  "+ ackermann(1,3));
        System.out.println("ackermann (2,2) =  "+ ackermann(2,2));
        System.out.println("ackermann (3,2) =  "+ ackermann(3,2));
    }

    public static int ackermann(int m, int n)
    {
        if(m == 0)
            return n + 1;
        else if (n == 0 )
            return ackermann(m-1,1);
        else
            return ackermann(m-1,ackermann(m,n-1));
    }
}
