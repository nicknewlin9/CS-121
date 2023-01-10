import java.util.ArrayList;
public class Pokemon
{
    //instance variables
    private String name;
    private int hitPoints;
    private int speed;
    private ArrayList<Move> movesList = new ArrayList<>();

    //constructor
    public Pokemon(String name, int hitPoints, int speed)
    {
        this.name = name;
        this.hitPoints = hitPoints;
        this.speed = speed;
    }

    //addMove method
    public void addMove(String name, int movePower)
    {
        movesList.add(new Move(name,movePower));
    }

    //setHitPoints method
    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }

    //getName method
    public String getName()
    {
        return name;
    }

    //getHitPoints method
    public int getHitPoints()
    {
        return hitPoints;
    }

    //getSpeed method
    public int getSpeed()
    {
        return speed;
    }

    //setSpeed method
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    //getMovesList method
    public ArrayList<Move> getMovesList()
    {
        return movesList;
    }

    //getPokemonInfo method
    public ArrayList<Object> getPokemonInfo()
    {
        ArrayList<Object> info = new ArrayList<>();
        info.add(this.name);
        info.add(this.hitPoints);
        info.add(this.speed);
        return info;
    }

    //getMoveByName method

    //NOT SURE IF THIS IS RIGHTTTTTT

    public Move getMoveByName(String moveName)
    {
        for (int x = 0; x < movesList.size(); x++)
        {
            if (movesList.get(x).getMoveName().contains(moveName))
                return movesList.get(x);
        }
        return null; //not sure if this is good
    }
}
