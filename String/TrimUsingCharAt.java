package string;
import java.util.Scanner;
public class TrimUsingCharAt {
	    public static int[] findTrimIndices(String str) {
	        int start = 0, end = 0;
	        int length = 0;
	        try {
	            while (true) {
	                str.charAt(length);
	                length++;
	            }
	        } catch (IndexOutOfBoundsException e) {
	            
	        for (start = 0; start < length; start++) {
	            if (str.charAt(start) != ' ') break;
	        for (end = length - 1; end >= start; end--) {
	            if (str.charAt(end) != ' ') break;
	        }

	        return new int[] {start, end};
	    }

	    public static String customSubstring(String str, int start, int end) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = start; i <= end; i++) {
	            sb.append(str.charAt(i));
	        }
	        return sb.toString();
	    }

	    public static boolean compareStrings(String s1, String s2) {
	        int len1 = 0, len2 = 0;
	        try {
	            while (true) {
	                s1.charAt(len1);
	                len1++;
	            }
	        } catch (IndexOutOfBoundsException e) {}
	        try {
	            while (true) {
	                s2.charAt(len2);
	                len2++;
	            }
	        } catch (IndexOutOfBoundsException e) {}

	        if (len1 != len2) return false;
	        for (int i = 0; i < len1; i++) {
	            if (s1.charAt(i) != s2.charAt(i)) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter text with leading/trailing spaces: ");
	        String input = scanner.nextLine();

	        int[] indices = findTrimIndices(input);
	        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
	        String trimmedBuiltIn = input.trim();

	        System.out.println("Custom trimmed: '" + trimmedCustom + "'");
	        System.out.println("Built-in trimmed: '" + trimmedBuiltIn + "'");
	        System.out.println("Are both equal? " + compareStrings(trimmedCustom, trimmedBuiltIn));
	}

}
