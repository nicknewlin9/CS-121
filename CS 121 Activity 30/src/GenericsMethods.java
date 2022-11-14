import java.util.*;

public class GenericsMethods {
    public <E> void printArrayList(ArrayList<E> inputArrList) {
        for (E element: inputArrList) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}