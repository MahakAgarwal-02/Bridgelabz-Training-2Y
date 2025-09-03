package string;
	import java.util.Scanner;
	public class CharArrayCompare {

	    public static char[] getCharsUsingCharAt(String str) {
	        char[] chars = new char[str.length()];
	        for (int i = 0; i < str.length(); i++) {
	            chars[i] = str.charAt(i);
	        }
	        return chars;
	    }

	    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
	        if (arr1.length != arr2.length) {
	            return false;
	        }
	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] != arr2[i]) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.next();

	        char[] userDefinedArray = getCharsUsingCharAt(input);
	        char[] builtInArray = input.toCharArray();

	        boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);

	        System.out.print("\nCharacters using user-defined method: ");
	        for (char c : userDefinedArray) {
	            System.out.print(c + " ");
	        }

	        System.out.print("\nCharacters using toCharArray(): ");
	        for (char c : builtInArray) {
	            System.out.print(c + " ");
	        }

	        System.out.println("\nAre both character arrays equal? " + areEqual);
	}

}
