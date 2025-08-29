package arrays;
import java.util.*;
public class level1_ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double[] heights = new double[11]; 
        double sum = 0.0;

        System.out.println("Enter the heights of 11 players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i]; 
        }

        double mean = sum / heights.length;

        System.out.println("\nMean height of the football team = " + mean + " cm");

	}

}
