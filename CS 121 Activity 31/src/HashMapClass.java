import java.util.*;

public class HashMapClass {
    //create a HashMap
    private Map<String, Integer> gradesMap = new HashMap<>();

    //method to add a key/value pair to the HashMap
    public void addToGradesList(String course, int score) {
        gradesMap.put(course, score);
    }

    //method to remove a key/value pair from the HashMap
    public void removeFromGradesList(String course) {
        gradesMap.remove(course);
    }

    //method to get the value from the map based on the key\
    public Object getScore(String course) {
        Object score;

        if (gradesMap.containsKey(course)) {
            score = gradesMap.get(course);
        }
        else {
            score = "Course not found.";
        }

        return score;
    }

    //method to display both the key and the value
    public void displayGrades() {
        gradesMap.forEach((course, score) -> {
            System.out.printf("Course: %s | Grade: %d\n",
                    course, score);
        });
    }
}