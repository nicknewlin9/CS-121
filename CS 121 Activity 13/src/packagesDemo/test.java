package packagesDemo;

public class test
{
    public static void main(String []args)
    {
        //create instance of the Element class
        Element element1 = new Element();



        //trying to access data fields in the Element.java class

        System.out.printf("Trying to get the element name: %s\n", element1.name);
        //System.out.printf("Trying to get the atomic symbol: %s\n", element1.symbol);
        //System.out.printf("Trying to get the atomic number: %d\n", element1.atomicNumber);
        System.out.printf("Trying to get the atomic weight: %f\n", element1.atomicWeight);



        //trying to access the methods in the Element.java class

        element1.getName();
        //element1.getSymbol();
        element1.getAtomicNumber();
        element1.getAtomicWeight();
    }
}
