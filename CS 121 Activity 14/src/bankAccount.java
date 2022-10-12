public class bankAccount
{
    //declare instance variables
    private int accountNumber;
    private String accountHolder;
    private int pinNumber;
    private double balance;

    //default constructor
    public bankAccount()
    {

    }

    //constructor with 1 parameter
    public bankAccount(String accountHolder)
    {
        this.accountHolder = accountHolder;
    }

    //constructor with 4 parameters
    public bankAccount(int accountNumber , String accountHolder , int pinNumber , double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.pinNumber = pinNumber;
        this.balance = balance;
    }

    //setter method
    public void setPinNumber(int newPin)
    {
        this.pinNumber = newPin;
    }

    //overloaded setter method
    public void setPinNumber(String newPin)
    {
        this.pinNumber = Integer.parseInt(newPin);
    }

    //getter method
    public int getAccountNumber()
    {
        return this.accountNumber;
    }
}
