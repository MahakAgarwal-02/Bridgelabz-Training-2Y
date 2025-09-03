package string;
import java.util.Scanner;
public class UniqueCharacters {
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
	    public static char[] findUniqueCharacters(String text) {
	        int len = findLength(text);
	        char[] unique = new char[len];
	        int uniqueCount = 0;

	        for (int i = 0; i < len; i++) {
	            char current = text.charAt(i);
	            boolean isUnique = true;

	            for (int j = 0; j < i; j++) {
	                if (text.charAt(j) == current) {
	                    isUnique = false;
	                    break;
	                }
	            }

	            if (isUnique) {
	                unique[uniqueCount] = current;
	                uniqueCount++;
	            }
	        }
	        char[] result = new char[uniqueCount];
	        for (int i = 0; i < uniqueCount; i++) {
	            result[i] = unique[i];
	        }
	        return result;
	    }
	    public static void displayCharacters(char[] arr) {
	        System.out.print("Unique characters: ");
	        for (char c : arr) {
	            System.out.print(c + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        char[] uniqueChars = findUniqueCharacters(input);
	        displayCharacters(uniqueChars);
	}

}
