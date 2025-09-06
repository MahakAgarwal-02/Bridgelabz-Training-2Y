package methods;
import java.util.*;
public class level3_ques3 {
	 public static int countDigits(int num) {
	        return String.valueOf(Math.abs(num)).length();
	    }
	 
	    public static int[] storeDigits(int num) {
	        int len = countDigits(num);
	        int[] digits = new int[len];
	        num = Math.abs(num);
	        for (int i = len - 1; i >= 0; i--) {
	            digits[i] = num % 10;
	            num /= 10;
	        }
	        return digits;
	    }

	    public static int sumOfDigits(int[] digits) {
	        int sum = 0;
	        for (int d : digits) sum += d;
	        return sum;
	    }

	    public static int sumOfSquares(int[] digits) {
	        int sumSq = 0;
	        for (int d : digits) sumSq += Math.pow(d, 2);
	        return sumSq;
	    }

	    public static boolean isHarshad(int num, int[] digits) {
	        int sum = sumOfDigits(digits);
	        return sum != 0 && num % sum == 0;
	    }

	    public static int[][] digitFrequency(int[] digits) {
	        int[][] freq = new int[10][2];
	        for (int i = 0; i < 10; i++) freq[i][0] = i; 

	        for (int d : digits) freq[d][1]++; 

	        return freq;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int[] digits = storeDigits(num);

	        System.out.println("Number of digits: " + countDigits(num));
	        System.out.println("Digits array: ");
	        for (int d : digits) System.out.print(d + " ");
	        System.out.println();

	        System.out.println("Sum of digits: " + sumOfDigits(digits));
	        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
	        System.out.println("Harshad number? " + (isHarshad(num, digits) ? "Yes" : "No"));

	        int[][] freq = digitFrequency(digits);
	        System.out.println("Digit frequency:");
	        for (int i = 0; i < freq.length; i++) {
	            if (freq[i][1] > 0)
	                System.out.println("Digit " + freq[i][0] + " appears " + freq[i][1] + " times");
	        }

	}

}
