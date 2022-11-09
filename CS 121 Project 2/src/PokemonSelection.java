/*
 *******************************************************************
 * Project 2
 * Name: Nicholas Newlin
 * Date of Submission (11/08/2022)
 * CS 121 Data Structures and Objects
 ******************** Program Documentation ************************
 *
 *
 *
 *
 *******************************************************************
 */
import java.util.Scanner;
public class PokemonSelection
{
    public Pokemon createPokemon()
    {
        //create a scanner object
        Scanner scanner = new Scanner(System.in);

        //create a pokemon object
        Pokemon pokemon = new Pokemon();

        //prompts user for pokemon info
        System.out.print("Enter the name: ");
        pokemon.setName(scanner.nextLine());
        System.out.print("Enter the hit points: ");
        pokemon.setHitPoints(scanner.nextInt());
        System.out.print("Enter the move: ");
        scanner.nextLine();
        pokemon.setMove(scanner.nextLine());
        System.out.print("Enter the move power: ");
        pokemon.setMovePower(scanner.nextInt());
        System.out.print("Enter the attackSpeed: ");
        pokemon.setAttackSpeed(scanner.nextInt());

        return pokemon;
    }
    public void assignPokemon()
    {
        System.out.print("Player 1: Select a Pokemon and enter its stats\n");
        Pokemon pokemon1 = createPokemon();
        System.out.print("Player 2: Select a Pokemon and enter its stats\n");
        Pokemon pokemon2 = createPokemon();

        System.out.print("\nPlayer 1 Pokemon\n---------------\n");
        System.out.print(pokemon1.displayPokemonStats(pokemon1));
        System.out.print("\nPlayer 2 Pokemon\n---------------\n");
        System.out.print(pokemon2.displayPokemonStats(pokemon2));
    }
}
