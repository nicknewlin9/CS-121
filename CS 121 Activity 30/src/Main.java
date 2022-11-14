import java.util.*;

public class Main {
    public static void main(String[] args) {
        GenericsMethods generic =  new GenericsMethods();
        Integer[] intArray = {1, 2, 3, 4, 5};
        ArrayList intArrList = new ArrayList<Integer>(Arrays.asList(intArray));
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        ArrayList doubleArrList = new ArrayList<Double>(Arrays.asList(doubleArray));
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        ArrayList charArrList = new ArrayList<Character>(Arrays.asList(charArray));
        String[] stringArray = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon"};
        ArrayList stringArrList = new ArrayList<String>(Arrays.asList(stringArray));

        System.out.print("Integer ArrayList: ");
        generic.printArrayList(intArrList);
        System.out.print("Double ArrayList: ");
        generic.printArrayList(doubleArrList);
        System.out.print("Char ArrayList: ");
        generic.printArrayList(charArrList);
        System.out.print("String ArrayList: ");
        generic.printArrayList(stringArrList);
    }
}