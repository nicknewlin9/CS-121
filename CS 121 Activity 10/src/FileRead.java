import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;
public class FileRead
{
    public static void main(String [] args)
    {
        File inputFile1 = new File("/Users/nicholasnewlin/Desktop/courses.txt");
        File inputFile2 = new File("courses.txt");
        try{
            Scanner input = new Scanner(inputFile1);
            String header = input.nextLine();
            System.out.println(header);
            while(input.hasNextLine()){
                String course = input.next();
                int credits = Integer.parseInt(input.next());
                int score = Integer.parseInt(input.next());
                System.out.printf("-%7s %3d %7d\n",course,credits,score);
            }
            input.close();
        }catch(FileNotFoundException e){
            System.err.println("File not found.");
        }
    }
}
