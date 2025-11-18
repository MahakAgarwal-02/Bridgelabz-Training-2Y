package Map;

import java.util.*;

public class EmployeeDepartmentMap {
    public static void main(String[] args) {

        HashMap<Integer, String> empMap = new HashMap<>();

        empMap.put(101, "HR");
        empMap.put(102, "IT");
        empMap.put(103, "Finance");
        empMap.put(104, "IT");
        empMap.put(105, "Sales");
        empMap.put(106, "HR");

        empMap.put(103, "IT");   

        String searchDept = "IT";
        System.out.println("Employees in Department: " + searchDept);
        for (Map.Entry<Integer, String> e : empMap.entrySet()) {
            if (e.getValue().equals(searchDept)) {
                System.out.println("Employee ID: " + e.getKey());
            }
        }

        HashMap<String, Integer> deptCount = new HashMap<>();

        for (String dept : empMap.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }

        System.out.println("\n=== Employees per Department ===");
        for (Map.Entry<String, Integer> d : deptCount.entrySet()) {
            System.out.println(d.getKey() + " → " + d.getValue());
        }
    }
}