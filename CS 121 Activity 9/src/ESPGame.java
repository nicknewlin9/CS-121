/*
 *******************************************************************
 * Activity 9
 * Name: Nicholas Newlin
 * Date of Submission (09/27/2022)
 * CS 121 Data Structures and Objects
 ******************** Program Documentation ************************
 *
 *
 *
 *
 *******************************************************************
 */
import java.util.Random;
import java.util.Scanner;
public class ESPGame
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number;
        String color;
        String guess;
        int correct = 0;
        for(int i = 1; i<=10; i++)
        {
            number = random.nextInt(5);
            if (number == 0)
                color = "red";
            else if (number == 1)
                color = "green";
            else if (number == 2)
                color = "blue";
            else if (number == 3)
                color = "orange";
            else
                color = "yellow";
            System.out.printf("%d. What color has the computer chosen? \n", i);
            guess = scanner.nextLine();
            System.out.printf(">The computer chose %s\n", color);
            if (guess.equals(color))
                correct++;
        }
        System.out.printf("You got %d out of 10 correct\n",correct);
    }
}
