public class staticActivity
{
    private String make;
    private String model;
    private int year;
    private static int number = 0;


    public staticActivity(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        number ++;
    }

    public static int getNumber()
    {
        return number;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }
}
