/*
 *******************************************************************
 * Activity 5
 * Name: Nicholas Newlin
 * Date of Submission (10/02/2022)
 * CS 121 Data Structures and Objects
 ******************** Program Documentation ************************
 *
 *
 *
 *
 *******************************************************************
 */
import java.util.Scanner;
public class RestaurantSelector
{
    public static void main(String [] args)
    {
        //create scanner object to get input from keyboard
        Scanner keyboard = new Scanner(System.in);

        //prompt user to input information
        System.out.println("Anyone vegetarian? True or False");
        boolean vegetarian = keyboard.nextBoolean();
        System.out.println("Anyone vegan? True or False");
        boolean vegan = keyboard.nextBoolean();
        System.out.println("Anyone gluten-free? True or False");
        boolean glutenFree = keyboard.nextBoolean();

        System.out.print("The restaurants yall can go to are:\n");

        if(!vegan){
            System.out.println("\tMain Street Pizza Company");
        }
        if(!vegan && !glutenFree ){
            System.out.println("\tMama's Fine Italian");
        }
        if(!vegan && !vegetarian){
            System.out.println("\tJoe's Gourmet Burgers");
        }
        System.out.println("\tCorner Cafe");
        System.out.println("\tChef's Kitchen");

        keyboard.close();
    }
}