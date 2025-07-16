package task7;

import java.util.ArrayList;

public class StringList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Mouse");

        System.out.println("Original list: " + list);
        list.clear();
        System.out.println("After clearing: " + list);
    }
}
