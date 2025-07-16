package task7;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();
        employees.put(103, "Prem");
        employees.put(101, "Vishnu");
        employees.put(102, "Anitha");

        System.out.println("Employee names in alphabetical order:");
        employees.values().stream().sorted().forEach(System.out::println);
    }
}

