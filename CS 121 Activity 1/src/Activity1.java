/*
 *******************************************************************
 * Activity 1
 * Name: Nicholas Newlin
 * Date of Submission (09/01/2022)
 * CS 121 Data Structures and Objects
 ******************** Program Documentation ************************
 *
 *
 *
 *
 *******************************************************************
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Activity1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String fullName = keyboard.nextLine();
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        StringBuilder name = new StringBuilder(fullName);
        System.out.println(name.reverse());
        keyboard.close();

        String fullName2 = JOptionPane.showInputDialog("Enter your first and last name");
        JOptionPane.showMessageDialog(null, fullName2.toUpperCase());
        JOptionPane.showMessageDialog(null, fullName2.toLowerCase());
        JOptionPane.showMessageDialog(null, name);

    }
}