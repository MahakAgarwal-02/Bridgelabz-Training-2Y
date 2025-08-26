package control_flow;
import java.util.*;
public class factors_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            
            int i = 1; 
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++; 
            }
        }

	}

}
