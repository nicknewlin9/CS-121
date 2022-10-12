public class Car
{
    //declare instance variables
    private String make;
    private String model;
    private int year;
    private double miles;

    //create constructor for car object
    public Car(String mak , String mod , int yr , double mils)
    {
        make = mak;
        model = mod;
        year = yr;
        miles = mils;
    }

    //method that uses the info from user to see if they guessed my dream car
    public void isMyDreamCar()
    {
        if (make.equalsIgnoreCase("jeep") && model.equalsIgnoreCase("wrangler"))
        {
            System.out.println("You guessed my dream car!");
        }
        else if (make.equalsIgnoreCase("jeep") && !model.equalsIgnoreCase("wrangler"))
        {
            System.out.println("You guessed my dream car make, but not the model");
        }
        else
        {
            System.out.println("You did not guess my dream car make or model");
        }
    }
}
