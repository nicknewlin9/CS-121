import java.util.Scanner;
public class SwitchActivity
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a cryptocurrency (either \"bitcoin\" , \"ethereum\" , \"cardano\" , or \"dogecoin\").\n");
        String crypto = scanner.nextLine();
        switch (crypto)
        {
            case "bitcoin":
                System.out.print("Current approximate price: $18,500\n");
                System.out.print("Current market cap: $363 billion\n");
                System.out.print("Current circulating supply: 19,162,000 BTC\n");
                break;
            case "ethereum":
                System.out.print("Current approximate price: $1,300\n");
                System.out.print("Current market cap: $161 billion\n");
                System.out.print("Current circulating supply: 122,551,000 ETH\n");
                break;
            case "cardano":
                System.out.print("Current approximate price: $0.43\n");
                System.out.print("Current market cap: $15 billion\n");
                System.out.print("Current circulating supply: 34,240,000,000 ADA\n");
                break;
            case "dogecoin":
                System.out.print("Current approximate price: $0.0610\n");
                System.out.print("Current market cap: $8 billion\n");
                System.out.print("Current circulating supply: 132,670,000,000 DOGE\n");
                break;
            default:
                System.out.print("Invalid cryptocurrency");
        }
        scanner.close();
    }
}
