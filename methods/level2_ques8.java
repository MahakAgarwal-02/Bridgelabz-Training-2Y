package methods;
import java.util.*;
public class level2_ques8 {

	 public static void findYoungest(String[] names, int[] ages) {
	        int minAgeIndex = 0;
	        for (int i = 1; i < ages.length; i++) {
	            if (ages[i] < ages[minAgeIndex]) {
	                minAgeIndex = i;
	            }
	        }
	        System.out.println("The youngest friend is " + names[minAgeIndex] + " with age " + ages[minAgeIndex]);
	    }

	    public static void findTallest(String[] names, int[] heights) {
	        int maxHeightIndex = 0;
	        for (int i = 1; i < heights.length; i++) {
	            if (heights[i] > heights[maxHeightIndex]) {
	                maxHeightIndex = i;
	            }
	        }
	        System.out.println("The tallest friend is " + names[maxHeightIndex] + " with height " + heights[maxHeightIndex] + " cm");
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextInt();
        }

        findYoungest(names, ages);
        findTallest(names, heights);

	}

}
