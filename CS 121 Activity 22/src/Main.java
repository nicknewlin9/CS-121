public class Main
{
    public static void main(String []args)
    {
        //creates 2 objects from the staticActivity class
        staticActivity object1 = new staticActivity("Jeep","Wrangler",2022);
        staticActivity object2 = new staticActivity("Tesla","Model X",2021);

        //prints the return value from the getNumber method
        System.out.printf("Make: %s\tModel: %s\n",object1.getMake(),object1.getModel());
        System.out.printf("Make: %s\tModel: %s\n",object2.getMake(),object2.getModel());
        System.out.printf("Number of cars: %d",staticActivity.getNumber());
    }
}
