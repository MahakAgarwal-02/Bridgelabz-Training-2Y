package string;
import java.util.Scanner;
public class Palindrome {
	    public static boolean isPalindromeCharAt(String text) {
	        int start = 0;
	        int end = text.length() - 1;
	        while (start < end) {
	            if (text.charAt(start) != text.charAt(end)) {
	                return false;
	            }
	            start++;
	            end--;
	        }
	        return true;
	    }

	    public static boolean isPalindromeRecursive(String text, int start, int end) {
	        if (start >= end) {
	            return true;
	        }
	        if (text.charAt(start) != text.charAt(end)) {
	            return false;
	        }
	        return isPalindromeRecursive(text, start + 1, end - 1);
	    }

	    public static boolean isPalindromeArray(String text) {
	        char[] original = text.toCharArray();
	        char[] reversed = reverseCharArray(text);
	        int length = original.length;
	        for (int i = 0; i < length; i++) {
	            if (original[i] != reversed[i]) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static char[] reverseCharArray(String text) {
	        int len = text.length();
	        char[] reversed = new char[len];
	        for (int i = 0; i < len; i++) {
	            reversed[i] = text.charAt(len - 1 - i);
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter text to check palindrome: ");
	        String input = scanner.nextLine();
	        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
	        boolean result1 = isPalindromeCharAt(cleanedInput);
	        boolean result2 = isPalindromeRecursive(cleanedInput, 0, cleanedInput.length() - 1);
	        boolean result3 = isPalindromeArray(cleanedInput);
	        System.out.println("\nPalindrome Check Results:");
	        System.out.println("--------------------------");
	        System.out.println("Logic 1 (charAt):       " + result1);
	        System.out.println("Logic 2 (Recursive):    " + result2);
	        System.out.println("Logic 3 (Array Method): " + result3);
	        if (result1 && result2 && result3) {
	            System.out.println("\n✅ The text is a Palindrome.");
	        } else {
	            System.out.println("\n❌ The text is NOT a Palindrome.");
	        }
	}

}
