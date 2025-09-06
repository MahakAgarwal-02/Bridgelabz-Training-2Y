package methods;
import java.util.*;
public class level3_ques1 {

	public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); 
        }
        return heights;
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return sumHeights(heights) / (double) heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights) if (h < min) min = h;
        return min;
    }

    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h;
        return max;
    }
	public static void main(String[] args) {
		int[] heights = generateHeights(11);

        System.out.print("Player heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();

        System.out.println("Shortest height: " + shortestHeight(heights) + " cm");
        System.out.println("Tallest height: " + tallestHeight(heights) + " cm");
        System.out.println("Mean height: " + meanHeight(heights) + " cm");

	}

}
