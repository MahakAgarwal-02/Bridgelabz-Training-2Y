package string;
import java.util.Scanner;
public class Frequency {
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
	    public static String[][] findFrequency(String text) {
	        int len = findLength(text);
	        int[] freq = new int[256]; 
	        for (int i = 0; i < len; i++) {
	            char c = text.charAt(i);
	            freq[(int) c]++;
	        }
	        String[][] result = new String[256][2];
	        int index = 0;

	        boolean[] visited = new boolean[256];

	        for (int i = 0; i < len; i++) {
	            char c = text.charAt(i);
	            int ascii = (int) c;

	            if (!visited[ascii]) {
	                visited[ascii] = true;
	                result[index][0] = String.valueOf(c);
	                result[index][1] = String.valueOf(freq[ascii]);
	                index++;
	            }
	        }
	        String[][] trimmedResult = new String[index][2];
	        for (int i = 0; i < index; i++) {
	            trimmedResult[i][0] = result[i][0];
	            trimmedResult[i][1] = result[i][1];
	        }

	        return trimmedResult;
	    }
	    public static void displayFrequency(String[][] freqArray) {
	        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
	        System.out.println("------------------------");
	        for (int i = 0; i < freqArray.length; i++) {
	            System.out.printf("%-10s %-10s\n", freqArray[i][0], freqArray[i][1]);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String[][] frequencies = findFrequency(input);
	        displayFrequency(frequencies);
	}

}
