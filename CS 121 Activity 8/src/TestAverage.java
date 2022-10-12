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
import java.util.Scanner;
public class TestAverage
{
    public static void main(String[] args)
    {
        //create a scanner object to get input from user
        Scanner scanner = new Scanner(System.in);

        int students;
        int numTests;
        double average;
        int cumulativeScore;
        System.out.print("Enter number of students\n");
        students = scanner.nextInt();
        System.out.print("Enter number of tests per student\n");
        numTests = scanner.nextInt();

        //for loop to calculate each students average
        for (int x = 1 ; x <= students ; x++)
        {
            average = 0;
            cumulativeScore = 0;
            System.out.printf("Student %d\n----------------", x);
            for (int y = 1 ; y <= numTests ; y++)
            {
                System.out.printf("\nEnter score %d: ", y);
                cumulativeScore += scanner.nextInt();
            }
            average = (double)cumulativeScore/numTests;
            System.out.printf("The average for student %d is: %.2f\n\n", x , average);
        }
        scanner.close();
    }
}
