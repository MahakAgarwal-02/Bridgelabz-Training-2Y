package string;
	import java.util.Scanner;

	public class stringcompare {

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

	        System.out.print("Enter first string: ");
	        String string1 = scanner.next();

	        System.out.print("Enter second string: ");
	        String string2 = scanner.next();

	        boolean resultCharAt = compareUsingCharAt(string1, string2);
	        boolean resultEquals = string1.equals(string2);

	        System.out.println("\nComparison using charAt(): " + resultCharAt);
	        System.out.println("Comparison using equals(): " + resultEquals);

	        if (resultCharAt == resultEquals) {
	            System.out.println("✅ Both methods returned the SAME result.");
	        } else {
	            System.out.println("❌ Methods returned DIFFERENT results.");
	    }
	}

}
