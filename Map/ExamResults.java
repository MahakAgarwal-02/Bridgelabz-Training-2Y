package Map;

import java.util.*;

public class ExamResults {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> examMap = new HashMap<>();

        examMap.put("Math", new HashMap<>());
        examMap.put("Science", new HashMap<>());
        examMap.put("English", new HashMap<>());

        examMap.get("Math").put("Alice", 92);
        examMap.get("Math").put("Bob", 78);
        examMap.get("Math").put("Carol", 88);

        examMap.get("Science").put("Alice", 85);
        examMap.get("Science").put("Bob", 91);
        examMap.get("Science").put("Carol", 73);

        examMap.get("English").put("Alice", 80);
        examMap.get("English").put("Bob", 95);
        examMap.get("English").put("Carol", 89);

        System.out.println("=== Top Scorer per Subject ===");
        for (String subject : examMap.keySet()) {
            Map<String, Integer> marksMap = examMap.get(subject);

            String topper = "";
            int maxMarks = -1;

            for (Map.Entry<String, Integer> e : marksMap.entrySet()) {
                if (e.getValue() > maxMarks) {
                    maxMarks = e.getValue();
                    topper = e.getKey();
                }
            }
            System.out.println(subject + " → " + topper + " (" + maxMarks + ")");
        }

        System.out.println("\n=== Average Score per Subject ===");
        for (String subject : examMap.keySet()) {
            Map<String, Integer> marksMap = examMap.get(subject);

            int total = 0;
            for (int m : marksMap.values()) {
                total += m;
            }
            double avg = total / (double) marksMap.size();
            System.out.println(subject + " → " + avg);
        }

        System.out.println("\n=== Subjects with Score > 90 ===");
        for (String subject : examMap.keySet()) {
            Map<String, Integer> marksMap = examMap.get(subject);

            boolean hasAbove90 = false;

            for (int m : marksMap.values()) {
                if (m > 90) {
                    hasAbove90 = true;
                    break;
                }
            }

            if (hasAbove90) {
                System.out.println(subject);
            }
        }
    }
}