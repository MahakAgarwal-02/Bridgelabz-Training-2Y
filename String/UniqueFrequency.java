package string;
import java.util.Scanner;
public class UniqueFrequency {
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

	    public static char[] getUniqueCharacters(String text) {
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

	    public static String[][] findFrequencies(String text) {
	        int len = findLength(text);
	        int[] freq = new int[256]; 
	        for (int i = 0; i < len; i++) {
	            char c = text.charAt(i);
	            freq[(int) c]++;
	        }
	        char[] uniqueChars = getUniqueCharacters(text);
	        int uniqueLen = findLength(new String(uniqueChars));

	        String[][] result = new String[uniqueLen][2];

	        for (int i = 0; i < uniqueLen; i++) {
	            char c = uniqueChars[i];
	            result[i][0] = String.valueOf(c);
	            result[i][1] = String.valueOf(freq[(int) c]);
	        }

	        return result;
	    }

	    public static void displayFrequencies(String[][] freqArray) {
	        System.out.printf("%-10s%-10s\n", "Character", "Frequency");
	        System.out.println("----------------------");
	        for (int i = 0; i < freqArray.length; i++) {
	            System.out.printf("%-10s%-10s\n", freqArray[i][0], freqArray[i][1]);
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String[][] frequencyTable = findFrequencies(input);
	        displayFrequencies(frequencyTable);
	}

}
