public class Main
{
    public static void main(String []args)
    {
        //create 3 instances of the bankAccount class

        //using default constructor
        bankAccount account1 = new bankAccount();
        //using constructor with 1 parameter
        bankAccount account2 = new bankAccount("Nick Newlin");
        //using constructor with 4 parameters
        bankAccount account3 = new bankAccount(12345678 , "Nick Newlin" , 1234 , 0.0);

        //using a getter method
        System.out.printf("Account 1's account number: %08d\n",account1.getAccountNumber());

        //using an overloaded setter method by using integer as parameter
        account1.setPinNumber(1234);
        System.out.print("Account 1's PIN number was changed to 1234\n");

        //using the other overloaded setter method using string as parameter
        account2.setPinNumber("4321");
        System.out.print("Account 2's PIN number was changed to 4321");
    }
}