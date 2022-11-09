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
        final int ROWS = 3;
        final int COLS = 4;
        double [ ] [ ] scores = new double [ROWS] [COLS];
        for (int row = 0; row < ROWS; row++)
        {
            for (int col = 0; col < COLS; col++)
            {
                System.out.printf("Element in row %d column %d is %f\n", row+1, col+1, scores[row][col]);
            }
        }
    }
}
