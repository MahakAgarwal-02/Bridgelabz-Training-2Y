package string;
	import java.util.Scanner;

	public class SubstringCompare {

	    public static String createSubstringUsingCharAt(String str, int start, int end) {
	        String result = "";
	        for (int i = start; i < end && i < str.length(); i++) {
	            result += str.charAt(i);
	        }
	        return result;
	    }

	    public static boolean compareUsingCharAt(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        for (int i = 0; i < str1.length(); i++) {
	            if (str1.charAt(i) != str2.charAt(i)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the main string: ");
	        String inputString = scanner.next();

	        System.out.print("Enter start index: ");
	        int startIndex = scanner.nextInt();

	        System.out.print("Enter end index: ");
	        int endIndex = scanner.nextInt();

	        String substringCharAt = createSubstringUsingCharAt(inputString, startIndex, endIndex);
	        String substringBuiltin = "";

	        if (startIndex >= 0 && endIndex <= inputString.length() && startIndex < endIndex) {
	            substringBuiltin = inputString.substring(startIndex, endIndex);
	        }

	        boolean areEqual = compareUsingCharAt(substringCharAt, substringBuiltin);

	        System.out.println("\nSubstring using charAt(): " + substringCharAt);
	        System.out.println("Substring using substring(): " + substringBuiltin);
	        System.out.println("Are both substrings equal? " + areEqual);
	}

}
