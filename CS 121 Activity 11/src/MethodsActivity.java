/*
 *******************************************************************
 * Activity 11
 * Name: Nicholas Newlin
 * Date of Submission (09/30/2022)
 * CS 121 Data Structures and Objects
 ******************** Program Documentation ************************
 *
 *
 *
 *
 *******************************************************************
 */
import java.util.Scanner;
public class MethodsActivity
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        double length = getLength();

        double width = getWidth();

        double area = getArea(length, width);

        displayData(length, width, area);

        scanner.close();
    }

    public static double getLength()
    {
        System.out.println("Enter the rectangle's length: ");
        double length = scanner.nextDouble();
        return length;
    }

    public static double getWidth()
    {
        System.out.println("Enter the rectangle's width: ");
        double width = scanner.nextDouble();
        return width;
    }

    public static double getArea(double length, double width)
    {
        double area = length * width;
        return area;
    }

    public static void displayData(double length, double width, double area)
    {
        System.out.printf("Rectangle length: %.2f\n", length);
        System.out.printf("Rectangle width: %.2f\n", width);
        System.out.printf("Rectangle area: %.2f\n", area);
    }
}