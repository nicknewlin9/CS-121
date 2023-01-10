import java.util.ArrayList;
import java.util.Random;
public class Pokedex
{
    //instance variables
    private ArrayList<Pokemon> pokeList= new ArrayList<>(10);
    private Random rand = new Random();

    //addPokemon method
    public void addPokemon(Pokemon pokemon)
    {
        pokeList.add(pokemon);
    }

    //getPokeList method
    public ArrayList<Pokemon> getPokeList()
    {
        return pokeList;
    }

    //selectPokemon method (index => 1)
    public Pokemon selectPokemon(int index)
    {
        return pokeList.get(index-1);
    }

    //getRandomPokemon method
    public Pokemon getRandomPokemon(Pokemon playerPokemon)
    {
        int playerPokeIndex = pokeList.indexOf(playerPokemon);
        int randomNumber = rand.nextInt(pokeList.size());
        if (randomNumber == playerPokeIndex)
            randomNumber = 0;
        else
            randomNumber += 1;
        return pokeList.get(randomNumber);
    }

    //getRandomMove method
    public Move getRandomMove(Pokemon computerPokemon)
    {
        int randomNumber = rand.nextInt(computerPokemon.getMovesList().size());
        return computerPokemon.getMovesList().get(randomNumber);
    }
}