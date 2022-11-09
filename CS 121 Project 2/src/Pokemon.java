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
public class Pokemon
{
    private String name;
    private int hitPoints;
    private String move;
    private int movePower;
    private int attackSpeed;

    //default constructor

    public Pokemon()
    {

    }

    //constructor

    public Pokemon(String name, int hitPoints, String move, int movePower, int attackSpeed)
    {
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }

    //setters

    public void setName(String name)
    {
        this.name = name;
    }

    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }

    public void setMove(String move)
    {
        this.move = move;
    }

    public void setMovePower(int movePower)
    {
        this.movePower = movePower;
    }

    public void setAttackSpeed(int attackSpeed)
    {
        this.attackSpeed = attackSpeed;
    }

    //getters

    public String getName()
    {
        return name;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public String getMove()
    {
        return move;
    }

    public int getMovePower()
    {
        return movePower;
    }

    public int getAttackSpeed()
    {
        return attackSpeed;
    }

    //returns a formatted string to display the pokemon's stats

    public String displayPokemonStats(Pokemon input)
    {
        return String.format("Name: %s\nHit Points: %d\nMove: %s\nMove Power: %d\nAttack Speed: %d\n" +
                "",input.getName(),input.getHitPoints(),input.getMove(),input.getMovePower(),input.getAttackSpeed());
    }
}
