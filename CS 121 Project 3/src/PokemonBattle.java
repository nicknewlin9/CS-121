import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class PokemonBattle
{
    //instance variables
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private Pokedex pokedex = new Pokedex();

    //addPokemonToGame method
    public void addPokemonToGame()
    {
        System.out.println("How many pokemon do you want to add?");
        int numOfPokemon = scanner.nextInt();

        for (int x = 1; x <= numOfPokemon; x++)
        {
            System.out.println("Name?");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("HP?");
            int hp = scanner.nextInt();
            System.out.println("Speed?");
            int speed = scanner.nextInt();

            pokedex.addPokemon(new Pokemon(name,hp,speed));

            System.out.println("How many moves?");
            int numOfMoves = scanner.nextInt();
            for (int y = 1; y <= numOfMoves; y++)
            {
                System.out.println("Move name?");
                scanner.nextLine();
                String moveName = scanner.nextLine();
                System.out.println("Move power?");
                int movePower = scanner.nextInt();
                pokedex.getPokeList().get(x).addMove(moveName,movePower);
            }
        }
    }

    //displayPokeList method
    public void displayPokeList()
    {
        for (int x = 1; x <= pokedex.getPokeList().size(); x++)
        {
            ArrayList<Object> pokemonInfo = pokedex.getPokeList().get(x).getPokemonInfo();
            System.out.printf("\nPokemon #%d:\n",x);
            System.out.printf("Name: %s\n", pokemonInfo.get(0));
            System.out.printf("HP: %d\n", (int)pokemonInfo.get(1));
            System.out.printf("Speed: %d\n", (int) pokemonInfo.get(2));

            for (int y = 1; y <= pokedex.getPokeList().get(x).getMovesList().size() ;y++)
            {
                ArrayList<Move> moveList = pokedex.getPokeList().get(x).getMovesList();
                System.out.printf("Move #%d:\n",y);
                System.out.printf("Move name: %s",moveList.get(y).getMoveName());
                System.out.printf("Move power: %d",moveList.get(y).getMovePower());
                System.out.println(pokedex.getPokeList().get(x-1).getMovesList().get(y-1));
            }
        }
    }

    //selectPlayerPokemon method
    public Pokemon selectPlayerPokemon()
    {
        displayPokeList();
        System.out.println("Which pokemon do you want to play? (Enter number)");
        return pokedex.selectPokemon(scanner.nextInt());
    }

    //selectComputerPokemon method
    public Pokemon selectComputerPokemon(Pokemon playerPokemon)
    {
        return pokedex.getRandomPokemon(playerPokemon);
    }

    //battlePokemon method
    public void battlePokemon(Pokemon playerPokemon, Pokemon computerPokemon)
    {
        int rounds;
        int p1wins = 0;
        int p2wins = 0;

        //pokemon1
        String name1 = playerPokemon.getName();
        int hp1 = playerPokemon.getHitPoints();
        String move1 = "Scratch";
        int power1 = 40;
        int speed1 = playerPokemon.getSpeed();

        //pokemon2
        String name2 = computerPokemon.getName();
        int hp2 = computerPokemon.getHitPoints();
        String move2 = "Fire Breath";
        int power2 = 1000;
        int speed2 = computerPokemon.getSpeed();

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

            //while loop to execute until someone wins the round
            while (hp1 > 0 && hp2 > 0)
            {
                //if statement to determine the winner of the round
                if (speed1 > speed2) //player 1 has higher speed
                {
                    //PLAYER CHOOSE WHAT MOVE, THEN COMPUTER CHOOSE MOVE
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
