package methods;
import java.util.*;
public class level1_ques8 {
	 public static void findRemainderAndQuotient(int dividend, int divisor) {
	        int quotient = dividend / divisor;
	        int remainder = dividend % divisor;
	        System.out.println("Quotient = " + quotient);
	        System.out.println("Remainder = " + remainder);
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        findRemainderAndQuotient(dividend, divisor);
	}

}
