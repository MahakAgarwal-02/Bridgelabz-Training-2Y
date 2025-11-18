package Map;

import java.util.*;

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Map<String, Integer> registrations = new HashMap<>();

        registrations.put("CS101", 45);
        registrations.put("CS102", 52);
        registrations.put("MA101", 3);
        registrations.put("PH201", 60);
        registrations.put("EN105", 10);

        addStudent(registrations, "CS101");
        addStudent(registrations, "MA101");
        dropStudent(registrations, "PH201");
        dropStudent(registrations, "MA101");

        printStatus(registrations);
    }

    static void addStudent(Map<String, Integer> map, String course) {
        map.put(course, map.get(course) + 1);
    }

    static void dropStudent(Map<String, Integer> map, String course) {
        int current = map.get(course);
        if (current > 0) map.put(course, current - 1);
    }

    static void printStatus(Map<String, Integer> map) {
        System.out.println("=== Near Full Courses (≥ 50 Students) ===");
        for (String course : map.keySet()) {
            if (map.get(course) >= 50)
                System.out.println(course + " → " + map.get(course));
        }

        System.out.println("\n=== Under-subcribed Courses (< 5 Students) ===");
        for (String course : map.keySet()) {
            if (map.get(course) < 5)
                System.out.println(course + " → " + map.get(course));
        }
    }
}