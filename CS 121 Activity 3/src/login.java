import javax.swing.*;
public class login
{
    public static void main(String[] args)
    {
        String username = "NN";
        String password = "secret";
        String name;
        String pw;
        String message;

        name = JOptionPane.showInputDialog("Enter username");
        pw = JOptionPane.showInputDialog("Enter password");
        if (username.equals(name) && password.equals(pw))
            message = "Welcome to CS 121!";
        else if (username.equals(name) && !password.equals(pw))
            message = "Password is incorrect";
        else if (!username.equals(name) && password.equals(pw))
            message = "Username is incorrect";
        else
            message = "Username and password is incorrect";
        JOptionPane.showMessageDialog(null,message);
    }
}
