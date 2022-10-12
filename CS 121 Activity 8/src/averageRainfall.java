import java.util.Scanner;
public class averageRainfall
{
    public static void main(String [] args)
    {
        int years;
        int months;
        int totalRainfall = 0;
        double averageRainfall;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of years");
        years = Integer.parseInt(input.nextLine());
        for(int i = 1; i <= years; i++){
            for(int j = 1; j <= 12; j++){
                System.out.printf("Enter inches of rainfall for year %d and month %d\n",i,j);
                int rainfall = Integer.parseInt(input.nextLine());
                totalRainfall += rainfall;
            }
        }
        months = years * 12;
        averageRainfall = (double)totalRainfall / months;
        System.out.printf("Number of months: %d\nTotal inches of rainfall: %d\nAverage rainfall per month for %d years: %.2f", months, totalRainfall, years, averageRainfall);
    }
}
