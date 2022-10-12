package packagesDemo;

public class Element
{
    //declare instance variables
    public String name;
    private String symbol;
    private int atomicNumber;
    public double atomicWeight;

    //constructor
    public Element()
    {
        this.name = "Hydrogen";
        this.symbol = "H";
        this.atomicNumber = 1;
        this.atomicWeight = 1.0078;
    }

    //method with public access modifier
    public void getName()
    {
        System.out.printf("The name of the element is: %s\n", this.name);
    }

    //method with private access modifier
    private void getSymbol()
    {
        System.out.printf("The atomic symbol is: %s\n", this.symbol);
    }

    //method with protected access modifier
    protected void getAtomicNumber()
    {
        System.out.printf("The atomic number is: %d\n", this.atomicNumber);
    }

    //method with default access modifier
    void getAtomicWeight()
    {
        System.out.printf("The atomic weight is: %f\n", this.atomicWeight);
    }
}