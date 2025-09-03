package string;
import java.util.Scanner;
public class CustomSplit {
	    public static int findLength(String str) {
	        int count = 0;
	        try {
	            while (true) {
	                str.charAt(count);
	                count++;
	            }
	        } catch (IndexOutOfBoundsException e) {
	            return count;
	        }
	    }

	    public static String[] customSplit(String text) {
	        int length = findLength(text);
	        int spaceCount = 0;
	        for (int i = 0; i < length; i++) {
	            if (text.charAt(i) == ' ') {
	                spaceCount++;
	            }
	        }

	        int[] spaceIndexes = new int[spaceCount];
	        int idx = 0;
	        for (int i = 0; i < length; i++) {
	            if (text.charAt(i) == ' ') {
	                spaceIndexes[idx++] = i;
	            }
	        }

	        String[] words = new String[spaceCount + 1];

	        int start = 0;
	        for (int i = 0; i < spaceCount; i++) {
	            int wordLength = spaceIndexes[i] - start;
	            String word = "";
	            for (int j = 0; j < wordLength; j++) {
	                word += text.charAt(start + j);
	            }
	            words[i] = word;
	            start = spaceIndexes[i] + 1;
	        }
	        String lastWord = "";
	        for (int i = start; i < length; i++) {
	            lastWord += text.charAt(i);
	        }
	        words[spaceCount] = lastWord;

	        return words;
	    }

	    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
	        if (arr1.length != arr2.length) return false;

	        for (int i = 0; i < arr1.length; i++) {
	            if (!arr1[i].equals(arr2[i])) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a text: ");
	        String input = scanner.nextLine();

	        String[] customSplitResult = customSplit(input);
	        String[] builtInSplitResult = input.split(" ");

	        System.out.println("Custom split result:");
	        for (String word : customSplitResult) {
	            System.out.println(word);
	        }

	        System.out.println("\nBuilt-in split result:");
	        for (String word : builtInSplitResult) {
	            System.out.println(word);
	        }

	        boolean areEqual = compareStringArrays(customSplitResult, builtInSplitResult);
	        System.out.println("\nAre both split results equal? " + areEqual);
	}

}
