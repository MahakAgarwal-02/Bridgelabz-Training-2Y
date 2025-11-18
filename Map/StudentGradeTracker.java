package Map;

import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {

        Map<String, Double> grades = new HashMap<>();

        grades.put("Alice", 85.5);
        grades.put("Bob", 72.0);
        grades.put("Charlie", 90.0);
        grades.put("David", 66.5);

        grades.put("Bob", 80.0);   

        grades.remove("David");

        System.out.println("Student Grades (sorted by names):");

        Map<String, Double> sorted = new TreeMap<>(grades);

        for (Map.Entry<String, Double> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}