// *******************************************************************
// Assignment #2
// Name: Nicholas Newlin
// Date of Submission (09/02/22)
// CS 121 Data Structures and Objects
// ******************** Program Documentation ************************
//
//
//
//
// *******************************************************************
//
//
//
//
// *******************************************************************
import javax.swing.*;
public class BookClubPoints
{
    public static void main(String[] args)
    {
        int numBook = Integer.parseInt(JOptionPane.showInputDialog("How many books have you purchased this month?"));
        int numPoints;

        if (numBook >= 4) {
            numPoints = 60;
        }
        else if(numBook == 3) {
            numPoints = 30;
        }
        else if (numBook == 2) {
            numPoints = 15;
        }
        else if (numBook == 1) {
            numPoints = 5;
        }
        else {
            numPoints = 0;
        }
        JOptionPane.showMessageDialog(null, "You have earned " + numPoints + " points");
    }
}
