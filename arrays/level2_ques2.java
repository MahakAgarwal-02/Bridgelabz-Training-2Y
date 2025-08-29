package arrays;
import java.util.*;
public class level2_ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        String[] names = {"Amar", "Akbar", "Anthony"};
	        int[] ages = new int[3];
	        double[] heights = new double[3];

	        for (int i = 0; i < 3; i++) {
	            System.out.print("Enter age of " + names[i] + ": ");
	            ages[i] = sc.nextInt();
	            System.out.print("Enter height of " + names[i] + " (in cm): ");
	            heights[i] = sc.nextDouble();
	        }

	        int youngestIndex = 0;
	        for (int i = 1; i < 3; i++) {
	            if (ages[i] < ages[youngestIndex]) {
	                youngestIndex = i;
	            }
	        }

	        int tallestIndex = 0;
	        for (int i = 1; i < 3; i++) {
	            if (heights[i] > heights[tallestIndex]) {
	                tallestIndex = i;
	            }
	        }

	        System.out.println("\nThe youngest friend is " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
	        System.out.println("The tallest friend is " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

	}

}
