package methods;
import java.util.Random;
public class level3_ques11 {

	public static int[][] generateEmployees(int n) {
        int[][] data = new int[n][2]; 
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); 
            data[i][1] = 1 + rand.nextInt(10);  
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] employees) {
        int n = employees.length;
        double[][] result = new double[n][2]; 
        for (int i = 0; i < n; i++) {
            double bonus = (employees[i][1] > 5) ? 0.05 * employees[i][0] : 0.02 * employees[i][0];
            result[i][1] = bonus;
            result[i][0] = employees[i][0] + bonus; 
        }
        return result;
    }

    public static void displayResults(int[][] employees, double[][] updated) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n","Emp","OldSalary","Years","Bonus","NewSalary");
        for (int i = 0; i < employees.length; i++) {
            totalOld += employees[i][0];
            totalNew += updated[i][0];
            totalBonus += updated[i][1];
            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f\n",
                    i+1, employees[i][0], employees[i][1], updated[i][1], updated[i][0]);
        }
        System.out.println("----------------------------------------------------------");
        System.out.printf("Total      %-10.2f           %-10.2f %-10.2f\n", totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployees(10);
        double[][] updated = calculateBonus(employees);
        displayResults(employees, updated);
}}
