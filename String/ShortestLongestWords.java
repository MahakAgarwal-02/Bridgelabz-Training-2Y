package string;
import java.util.Scanner;
public class ShortestLongestWords {
	
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
	            String word = "";
	            for (int j = start; j < spaceIndexes[i]; j++) {
	                word += text.charAt(j);
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

	    public static String[][] wordsWithLengths(String[] words) {
	        String[][] result = new String[words.length][2];
	        for (int i = 0; i < words.length; i++) {
	            result[i][0] = words[i];
	            result[i][1] = String.valueOf(findLength(words[i]));
	        }
	        return result;
	    }

	    public static int[] findShortestAndLongest(String[][] wordLengths) {
	        int shortestIndex = 0;
	        int longestIndex = 0;
	        int shortestLength = Integer.parseInt(wordLengths[0][1]);
	        int longestLength = Integer.parseInt(wordLengths[0][1]);

	        for (int i = 1; i < wordLengths.length; i++) {
	            int length = Integer.parseInt(wordLengths[i][1]);
	            if (length < shortestLength) {
	                shortestLength = length;
	                shortestIndex = i;
	            }
	            if (length > longestLength) {
	                longestLength = length;
	                longestIndex = i;
	            }
	        }

	        return new int[] {shortestIndex, longestIndex};
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a text: ");
	        String input = scanner.nextLine();

	        String[] words = customSplit(input);
	        String[][] wordLengths = wordsWithLengths(words);

	        int[] shortestLongestIndices = findShortestAndLongest(wordLengths);

	        System.out.println("Shortest word: " + wordLengths[shortestLongestIndices[0]][0] +
	                " (Length: " + wordLengths[shortestLongestIndices[0]][1] + ")");

	        System.out.println("Longest word: " + wordLengths[shortestLongestIndices[1]][0] +
	                " (Length: " + wordLengths[shortestLongestIndices[1]][1] + ")");
	}

}
