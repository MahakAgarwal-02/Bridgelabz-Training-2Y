package control_flow;
import java.util.*;
public class employees_bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0.0;

        if (years > 5) {
            bonus = 0.05 * salary;  
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus. Years of service less than or equal to 5.");
        }

	}

}
