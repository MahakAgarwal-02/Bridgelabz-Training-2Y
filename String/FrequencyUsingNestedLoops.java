package string;
import java.util.Scanner;
public class FrequencyUsingNestedLoops {

	    public static String[] findFrequencies(String text) {
	        char[] chars = text.toCharArray(); 
	        int len = chars.length;
	        int[] freq = new int[len];

	        for (int i = 0; i < len; i++) {
	            if (chars[i] == '0') continue;

	            freq[i] = 1; 

	            for (int j = i + 1; j < len; j++) {
	                if (chars[i] == chars[j]) {
	                    freq[i]++;
	                    chars[j] = '0'; 
	                }
	            }
	        }
	        int count = 0;
	        for (int i = 0; i < len; i++) {
	            if (chars[i] != '0') {
	                count++;
	            }
	        }

	        String[] result = new String[count];
	        int index = 0;

	        for (int i = 0; i < len; i++) {
	            if (chars[i] != '0') {
	                result[index] = "Character: '" + chars[i] + "', Frequency: " + freq[i];
	                index++;
	            }
	        }

	        return result;
	    }

	    public static void displayFrequencies(String[] result) {
	        System.out.println("Character Frequency Table:");
	        System.out.println("--------------------------");
	        for (String entry : result) {
	            System.out.println(entry);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String[] frequencies = findFrequencies(input);
	        displayFrequencies(frequencies);
	}

}
