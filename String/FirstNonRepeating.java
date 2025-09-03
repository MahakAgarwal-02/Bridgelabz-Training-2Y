package string;
import java.util.Scanner;
public class FirstNonRepeating {
	    public static int findLength(String text) {
	        int count = 0;
	        try {
	            while (true) {
	                text.charAt(count);
	                count++;
	            }
	        } catch (Exception e) {
	            return count;
	        }
	    }
	    public static char findFirstNonRepeatingChar(String text) {
	        int len = findLength(text);
	        int[] freq = new int[256]; 
	        for (int i = 0; i < len; i++) {
	            char c = text.charAt(i);
	            freq[(int) c]++;
	        }
	        for (int i = 0; i < len; i++) {
	            char c = text.charAt(i);
	            if (freq[(int) c] == 1) {
	                return c;
	            }
	        }

	        return '\0'; 
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        char result = findFirstNonRepeatingChar(input);

	        if (result == '\0') {
	            System.out.println("No non-repeating character found.");
	        } else {
	            System.out.println("First non-repeating character: " + result);
	        }
	}

}
