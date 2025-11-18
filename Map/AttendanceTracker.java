package Map;

import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {

        List<String> students = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma");
        Map<String, Integer> attendance = new HashMap<>();

        for (String s : students) {
            attendance.put(s, 0);
        }

        List<List<String>> dailyAttendance = Arrays.asList(
                Arrays.asList("Alice", "Bob", "Charlie"),
                Arrays.asList("Alice", "David"),
                Arrays.asList("Bob", "Charlie"),
                Arrays.asList("Alice", "Emma"),
                Arrays.asList("Charlie"),
                Arrays.asList("Alice", "Bob", "Emma"),
                Arrays.asList("David"),
                Arrays.asList("Alice", "Charlie", "Emma"),
                Arrays.asList("Bob"),
                Arrays.asList("Alice", "Charlie"),
                Arrays.asList("David", "Emma"),
                Arrays.asList("Alice", "Charlie"),
                Arrays.asList("Bob", "Emma"),
                Arrays.asList("Alice"),
                Arrays.asList("Charlie", "Emma")
        );

        for (List<String> presentStudents : dailyAttendance) {
            for (String name : presentStudents) {
                attendance.put(name, attendance.get(name) + 1);
            }
        }

        System.out.println("Total Attendance for Each Student:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("\nStudents with attendance < 10 days:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < 10) {
                System.out.println(entry.getKey());
            }
        }
    }
}