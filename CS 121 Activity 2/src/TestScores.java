/*
 *******************************************************************
 * Activity 2
 * Name: Nicholas Newlin
 * Date of Submission (09/02/2022)
 * CS 121 Data Structures and Objects
 ******************** Program Documentation ************************
 *
 *
 *
 *
 *******************************************************************
 */
import javax.swing.*;
public class TestScores
{
    public static void main(String[] args)
    {
        double score1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first test score"));
        double score2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second test score"));
        double score3 = Double.parseDouble(JOptionPane.showInputDialog("Enter third test score"));
        double average = (score1+score2+score3)/3;
        char grade = 'Z'; // it wont let me run the program without actually assigning the variable... not sure why

        if (average < 60) {
            grade = 'F';
        }
        else if (average >= 60 && average <= 69) {
            grade = 'D';
        }
        else if (average >= 70 && average <= 79) {
            grade = 'C';
        }
        else if (average >= 80 && average <= 89) {
            grade = 'B';
        }
        else if (average >= 90 && average <= 100) {
            grade = 'A';
        }
        JOptionPane.showMessageDialog(null, "Average test score: " + average + "\nLetter Grade: " + grade);
    }
}