package task7;

import java.util.ArrayList;

public class ListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        String[] array = new String[list.size()];
        list.toArray(array);

        System.out.println("Converted array:");
        for (String item : array) {
            System.out.println(item);
        }
    }
}
