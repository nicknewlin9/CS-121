import javax.swing.*;
public class triangle
{
    public static void main(String[] args)
    {
        int side1;
        int side2;
        int side3;
        String triangle;
        side1 = Integer.parseInt(JOptionPane.showInputDialog("Length of side 1"));
        side2 = Integer.parseInt(JOptionPane.showInputDialog("Length of side 2"));
        side3 = Integer.parseInt(JOptionPane.showInputDialog("Length of side 3"));
        if (side1 != side2 && side1 != side3 && side2 != side3)
            triangle = "Scalene";
        else if (side1 == side2 && side2 == side3)
            triangle = "Equilateral";
        else if (side1 == side2 || side1 == side3 || side2 == side3)
            triangle = "Isosceles";
        else
            triangle = "Not a triangle";
        JOptionPane.showMessageDialog(null,String.format("The triangle is %s ",triangle));
        System.exit(0);
    }
}
