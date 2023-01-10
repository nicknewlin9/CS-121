public class Main
{
    public static void main(String[]args)
    {
        PokemonBattle battle = new PokemonBattle();
        battle.addPokemonToGame();
        Pokemon playerPokemon = battle.selectPlayerPokemon();
        Pokemon computerPokemon = battle.selectComputerPokemon(playerPokemon);
        battle.battlePokemon(playerPokemon,computerPokemon);
    }
}
