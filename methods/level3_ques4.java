package methods;
import java.util.*;
public class level3_ques4 {
	
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

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) if (arr1[i] != arr2[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int num) {
        int[] digits = storeDigits(num);
        int[] rev = reverseArray(digits);
        return arraysEqual(digits, rev);
    }

    public static boolean isDuckNumber(int num) {
        int[] digits = storeDigits(num);
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);
        System.out.println("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        int[] reversed = reverseArray(digits);
        System.out.println("Reversed array: ");
        for (int d : reversed) System.out.print(d + " ");
        System.out.println();

        System.out.println("Palindrome? " + (isPalindrome(num) ? "Yes" : "No"));
        System.out.println("Duck number? " + (isDuckNumber(num) ? "Yes" : "No"));

	}

}
