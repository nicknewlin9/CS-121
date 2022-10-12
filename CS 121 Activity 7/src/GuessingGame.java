import javax.swing.*;
public class GuessingGame
{
    public static void main(String [] args)
    {
        int numberOfGuesses = 0;
        int number = 33;
        String input;
        int guess;
        while(true)
        {
            numberOfGuesses += 1;
            input = JOptionPane.showInputDialog("Guess a number between 1 and 100," + " or enter \"q\" if you give up:");
            if(input.equalsIgnoreCase("q"))
            {
                System.out.printf("Quitter! The number was %d",number);
                break;
            }
            else
            {
                guess = Integer.parseInt(input);
                if (guess > number)
                    System.out.println("Too high... guess again");
                else if (guess < number)
                    System.out.println("Too low... guess again");
                else
                {
                    System.out.printf("Correct! \nNumber of guesses: %d", numberOfGuesses);
                    break;
                }
            }
        }
    }
}
