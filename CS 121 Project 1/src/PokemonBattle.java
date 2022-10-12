/*
 *******************************************************************
 * Project 1
 * Name: Nicholas Newlin
 * Date of Submission (09/25/2022)
 * CS 121 Data Structures and Objects
 ******************** Program Documentation ************************
 * This program simulates a Pokemon game
 *******************************************************************
 */
import java.util.Scanner;
import java.util.Random;
public class PokemonBattle
{
    public static void main(String[] args)
    {
        //initializing and declaring variables
        int rounds;
        int p1wins = 0;
        int p2wins = 0;

        //pokemon1
        String name1;
        int hp1;
        String move1;
        int power1;
        int speed1;

        //pokemon2
        String name2;
        int hp2;
        String move2;
        int power2;
        int speed2;

        //create scanner object to get input from keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.print("**GET READY TO BATTLE YOUR POKEMON**\n");

        //ask user how many rounds
        System.out.print("Enter odd number of rounds: \n");
        rounds = scanner.nextInt();

        //this code should execute for each round
        for(int x = 1; x<= rounds; x++)
        {
            System.out.printf("Round %d\n", x);
            System.out.print("------------------------------------------\n");

            //get info from user for pokemon 1
            System.out.print("Player 1: Enter your Pokemon's information\n");
            System.out.print("Pokemon's name:\n");
            scanner.nextLine();
            name1 = scanner.nextLine();
            System.out.print("Pokemon's HP:\n");
            hp1 = scanner.nextInt();
            System.out.print("Pokemon's move:\n");
            scanner.nextLine();
            move1 = scanner.nextLine();
            System.out.print("Pokemon's move power:\n");
            power1 = scanner.nextInt();
            System.out.print("Pokemon's attack speed:\n");
            speed1 = scanner.nextInt();

            //get info from user for pokemon 2
            System.out.print("\nPlayer 2: Enter your Pokemon's information\n");
            System.out.print("Pokemon's name:\n");
            scanner.nextLine();
            name2 = scanner.nextLine();
            System.out.print("Pokemon's HP:\n");
            hp2 = scanner.nextInt();
            System.out.print("Pokemon's move:\n");
            scanner.nextLine();
            move2 = scanner.nextLine();
            System.out.print("Pokemon's move power:\n");
            power2 = scanner.nextInt();
            System.out.print("Pokemon's attack speed:\n");
            speed2 = scanner.nextInt();
            System.out.print("\n");

            //while loop to execute until someone wins the round
            while (hp1 > 0 && hp2 > 0)
            {
                //if statement to determine the winner of the round
                if (speed1 > speed2) //player 1 has higher speed
                {
                    System.out.printf("%s used %s\n", name1, move1);
                    hp2 -= power1;
                    if (hp2 <= 0)
                    {
                        System.out.printf("Player 1's %s wins round %d\n\n", name1, x);
                        p1wins += 1;
                        break;
                    }
                    System.out.printf("%s used %s\n", name2, move2);
                    hp1 -= power2;
                    if (hp1 <= 0)
                    {
                        System.out.printf("Player 2's %s wins round %d\n\n", name2, x);
                        p2wins += 1;
                        break;
                    }
                }


                else if (speed2 > speed1) //player 2 has a higher speed
                {
                    System.out.printf("%s used %s\n", name2, move2);
                    hp1 -= power2;
                    if (hp1 <= 0)
                    {
                        System.out.printf("Player 2's %s wins round %d\n\n", name2, x);
                        p2wins += 1;
                        break;
                    }
                    System.out.printf("%s used %s\n", name1, move1);
                    hp2 -= power1;
                    if (hp2 <= 0)
                    {
                        System.out.printf("Player 1's %s wins round %d\n\n", name1, x);
                        p1wins += 1;
                        break;
                    }
                }


                else //both have same speed, use random boolean to find if player 1 goes first
                {
                    //create a random object
                    Random random = new Random();
                    if(random.nextBoolean()) //player 1 goes first
                    {
                        System.out.print("Player 1 was randomly chosen\n");
                        System.out.printf("%s used %s\n", name1, move1);
                        hp2 -= power1;
                        if (hp2 <= 0)
                        {
                            System.out.printf("Player 1's %s wins round %d\n\n", name1, x);
                            p1wins += 1;
                            break;
                        }
                        System.out.printf("%s used %s\n", name2, move2);
                        hp1 -= power2;
                        if (hp1 <= 0)
                        {
                            System.out.printf("Player 2's %s wins round %d\n\n", name2, x);
                            p2wins += 1;
                            break;
                        }
                    }
                    else //player 2 goes first
                    {
                        System.out.print("Player 2 was randomly chosen\n");
                        System.out.printf("%s used %s\n", name2, move2);
                        hp1 -= power2;
                        if (hp1 <= 0)
                        {
                            System.out.printf("Player 2's %s wins round %d\n\n", name2, x);
                            p2wins += 1;
                            break;
                        }
                        System.out.printf("%s used %s\n", name1, move1);
                        hp2 -= power1;
                        if (hp2 <= 0)
                        {
                            System.out.printf("Player 1's %s wins round %d\n\n", name1, x);
                            p1wins += 1;
                            break;
                        }
                    }
                }
            }
        }
        scanner.close();
        System.out.print("----------\n");
        System.out.printf("\nFinal Scores\nPlayer 1: %d\nPlayer 2: %d\n\n", p1wins, p2wins);
        System.out.print("----------\n");
        if (p1wins > p2wins)
            System.out.print("PLAYER 1 WINS!!\n");
        else
            System.out.print("PLAYER 2 WINS!!\n");
    }
}