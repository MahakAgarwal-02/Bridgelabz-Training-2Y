package control_flow;
import java.util.*;
public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a positive integer: ");
		int n = sc.nextInt();
		if (n <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {

            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
	}

}
