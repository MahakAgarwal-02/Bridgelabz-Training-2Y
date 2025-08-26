package control_flow;
import java.util.*;
public class countDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Number of digits: 1");
        } else {
            int count = 0;
            int originalNumber = Math.abs(number); 
            while (originalNumber != 0) {
                originalNumber = originalNumber / 10; 
                count++;
            }

            System.out.println("Number of digits: " + count);
        }

	}

}
