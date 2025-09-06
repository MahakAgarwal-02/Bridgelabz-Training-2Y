package methods;
import java.util.*;
public class level3_ques2 {

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

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] digits) {
        int sum = 0, n = digits.length;
        for (int d : digits) sum += Math.pow(d, n);
        int num = 0;
        for (int d : digits) num = num * 10 + d;
        return sum == num;
    }

    public static int[] findLargestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) { second = largest; largest = d; }
            else if (d > second && d != largest) second = d;
        }
        return new int[]{largest, second};
    }

    public static int[] findSmallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) { second = smallest; smallest = d; }
            else if (d < second && d != smallest) second = d;
        }
        return new int[]{smallest, second};
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

	        System.out.println("Duck number? " + (isDuckNumber(digits) ? "Yes" : "No"));
	        System.out.println("Armstrong number? " + (isArmstrong(digits) ? "Yes" : "No"));

	        int[] largest = findLargestSecondLargest(digits);
	        System.out.println("Largest: " + largest[0] + ", Second largest: " + largest[1]);

	        int[] smallest = findSmallestSecondSmallest(digits);
	        System.out.println("Smallest: " + smallest[0] + ", Second smallest: " + smallest[1]);

	}

}
