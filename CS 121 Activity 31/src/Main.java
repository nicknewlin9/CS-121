import java.util.*;

public class Main {
    public static void main(String[] args) {
        //create an instance of HashMapClass
        HashMapClass demo = new HashMapClass();

        //use the instance to:
        //  -add at least 3 key/value pairs to the HashMap.
        demo.addToGradesList("CS121", 98);
        demo.addToGradesList("CS124", 87);
        demo.addToGradesList("CS224", 79);

        //  -display all the key/value pairs.
        demo.displayGrades();

        //  -remove one of the key/value pairs.
        System.out.println("CS121 Grade: " + demo.getScore("CS121"));
        demo.removeFromGradesList("CS121");
        System.out.println("CS121 Grade: " + demo.getScore("CS121"));

        //  -display the key/value pairs again.
        demo.displayGrades();
    }
}