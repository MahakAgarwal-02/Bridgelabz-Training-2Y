package string;
import java.util.Scanner;
public class Anagram {
	    public static boolean areAnagrams(String text1, String text2) {
	        text1 = text1.replaceAll("\\s+", "").toLowerCase();
	        text2 = text2.replaceAll("\\s+", "").toLowerCase();

	        if (text1.length() != text2.length()) {
	            return false;
	        }

	        int[] freq1 = new int[256];
	        int[] freq2 = new int[256];

	        for (int i = 0; i < text1.length(); i++) {
	            freq1[text1.charAt(i)]++;
	            freq2[text2.charAt(i)]++;
	        }

	        for (int i = 0; i < 256; i++) {
	            if (freq1[i] != freq2[i]) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first text: ");
	        String text1 = scanner.nextLine();
	        System.out.print("Enter second text: ");
	        String text2 = scanner.nextLine();
	        boolean result = areAnagrams(text1, text2);
	        System.out.println("\nAnagram Check Result:");
	        System.out.println("----------------------");
	        System.out.println("Are the two texts anagrams? " + result);
	}

}
