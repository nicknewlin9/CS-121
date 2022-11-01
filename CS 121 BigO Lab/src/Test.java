/*
 *******************************************************************
 * BigO Lab
 * Name: Nicholas Newlin
 * Date of Submission (11/01/2022)
 * CS 121 Data Structures and Objects
 ******************** Program Documentation ************************
 *
 *******************************************************************
 */
public class Test
{
    public static void main(String[] args)
    {
        //create instance of BigO class
        BigO bigO = new BigO();

        //executing printOnce method
        bigO.printOnce("Hello World");
        System.out.println();

        //executing printNTimes method
        bigO.printNTimes(5);
        System.out.println();

        //executing printNSquaredTimes method
        bigO.printNSquaredTimes(5);
        System.out.println();
    }
}