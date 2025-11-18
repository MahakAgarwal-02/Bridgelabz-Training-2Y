package Map;

import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {

        Map<String, Double> salaryMap = new HashMap<>();

        salaryMap.put("Amit", 55000.0);
        salaryMap.put("Priya", 72000.0);
        salaryMap.put("Rahul", 68000.0);
        salaryMap.put("Sneha", 82000.0);
        salaryMap.put("Karan", 45000.0);
        salaryMap.put("Meera", 82000.0);

        giveRaise(salaryMap, "Amit", 10);   
        giveRaise(salaryMap, "Priya", 5);   
        giveRaise(salaryMap, "John", 12);   

        System.out.println("\nAverage Salary: " + averageSalary(salaryMap));

        printHighestPaid(salaryMap);
    }

    static void giveRaise(Map<String, Double> map, String name, double percent) {
        if (!map.containsKey(name)) {
            System.out.println("Employee not found: " + name);
            return;
        }
        double newSalary = map.get(name) * (1 + percent / 100);
        map.put(name, newSalary);
    }

    static double averageSalary(Map<String, Double> map) {
        double sum = 0;
        for (double salary : map.values()) sum += salary;
        return sum / map.size();
    }

    static void printHighestPaid(Map<String, Double> map) {
        double max = Collections.max(map.values());

        System.out.println("\nHighest Salary = " + max);
        System.out.println("Highest Paid Employee(s):");

        for (String name : map.keySet()) {
            if (map.get(name) == max) {
                System.out.println(name + " → " + map.get(name));
            }
        }
    }
}
