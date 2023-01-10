public class Move
{
    //instance variables
    private String moveName;
    private int movePower;

    //constructor
    public Move(String moveName, int movePower)
    {
        this.moveName =  moveName;
        this.movePower = movePower;
    }

    //getMoveName method
    public String getMoveName()
    {
        return moveName;
    }

    //getMovePower method
    public int getMovePower()
    {
        return movePower;
    }
}
