package methods;
import java.util.*;
public class level3_ques6 {

	 public static int sumOfDivisors(int num) {
	        int sum = 1; 
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) sum += i;
	        }
	        return sum;
	    }

	    public static boolean isPerfect(int num) {
	        return num > 0 && sumOfDivisors(num) == num;
	    }

	    public static boolean isAbundant(int num) {
	        return num > 0 && sumOfDivisors(num) > num;
	    }

	    public static boolean isDeficient(int num) {
	        return num > 0 && sumOfDivisors(num) < num;
	    }

	    public static boolean isStrong(int num) {
	        int original = num, sum = 0;
	        while (num != 0) {
	            int d = num % 10;
	            sum += factorial(d);
	            num /= 10;
	        }
	        return sum == original;
	    }

	    public static int factorial(int n) {
	        int fact = 1;
	        for (int i = 2; i <= n; i++) fact *= i;
	        return fact;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        System.out.println("Perfect? " + (isPerfect(num) ? "Yes" : "No"));
	        System.out.println("Abundant? " + (isAbundant(num) ? "Yes" : "No"));
	        System.out.println("Deficient? " + (isDeficient(num) ? "Yes" : "No"));
	        System.out.println("Strong? " + (isStrong(num) ? "Yes" : "No"));	}

}
