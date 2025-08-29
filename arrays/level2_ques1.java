package arrays;
import java.util.*;
public class level2_ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int numEmployees = 10;
        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;

        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + i + ":");
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();

            double bonus;
            if (years > 5) {
                bonus = salary * 0.05; 
            } else {
                bonus = salary * 0.02; 
            }

            double newSalary = salary + bonus;

            System.out.println("Old Salary: " + salary + " | Bonus: " + bonus + " | New Salary: " + newSalary);

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

	}

}
