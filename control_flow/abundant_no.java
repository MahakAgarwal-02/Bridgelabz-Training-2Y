package control_flow;
import java.util.*;
public class abundant_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int sum = 0;

	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }

	        if (sum > number) {
	            System.out.println(number + " is an Abundant Number.");
	        } else {
	            System.out.println(number + " is NOT an Abundant Number.");
	        }
	}

}
