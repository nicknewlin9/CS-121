import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class FileOutput
{
    public static void main (String [] args) throws FileNotFoundException
    {
        File outputFile = new File("mycourses.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String course;
        String credits;
        String score;
        output.printf("%s %s %s\n","Course", "Credits", "Score");
        for(int i = 1; i <= 2; i++){
            course = JOptionPane.showInputDialog(String.format("Enter the name of the course %d", i));
            credits = JOptionPane.showInputDialog("Enter the course credits");
            score = JOptionPane.showInputDialog("Enter the course score");
            output.printf("%s %s %s\n",course,credits,score);
        }
        output.close();
    }
}
