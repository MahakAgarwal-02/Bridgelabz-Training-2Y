package methods;
import java.util.*;
public class level3_ques7 {

	 public static int[] findFactors(int num) {
	        int count = 0;
	        for (int i = 1; i <= num; i++) if (num % i == 0) count++;

	        int[] factors = new int[count];
	        int index = 0;
	        for (int i = 1; i <= num; i++) if (num % i == 0) factors[index++] = i;

	        return factors;
	    }

	    public static int greatestFactor(int[] factors) {
	        int max = factors[0];
	        for (int f : factors) if (f > max) max = f;
	        return max;
	    }
	    
	    public static int sumOfFactors(int[] factors) {
	        int sum = 0;
	        for (int f : factors) sum += f;
	        return sum;
	    }

	    public static long productOfFactors(int[] factors) {
	        long prod = 1;
	        for (int f : factors) prod *= f;
	        return prod;
	    }

	    public static long productOfCubes(int[] factors) {
	        long prod = 1;
	        for (int f : factors) prod *= Math.pow(f, 3);
	        return prod;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int[] factors = findFactors(num);
	        System.out.print("Factors: ");
	        for (int f : factors) System.out.print(f + " ");
	        System.out.println();

	        System.out.println("Greatest factor: " + greatestFactor(factors));
	        System.out.println("Sum of factors: " + sumOfFactors(factors));
	        System.out.println("Product of factors: " + productOfFactors(factors));
	        System.out.println("Product of cubes of factors: " + productOfCubes(factors));

}}

