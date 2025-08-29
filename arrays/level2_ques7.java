package arrays;
import java.util.*;
public class level2_ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of persons: ");
	        int n = sc.nextInt();

	        double[][] data = new double[n][3];  
	        String[] status = new String[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nPerson " + (i + 1));
	            System.out.print("Height (m): ");
	            data[i][0] = sc.nextDouble();
	            System.out.print("Weight (kg): ");
	            data[i][1] = sc.nextDouble();

	            data[i][2] = data[i][1] / (data[i][0] * data[i][0]);

	            if (data[i][2] <= 18.4) status[i] = "Underweight";
	            else if (data[i][2] >=18.5 || data[i][2] <= 24.9) status[i] = "Normal";
	            else if (data[i][2]>=25.0 || data[i][2] <= 39.9) status[i] = "Overweight";
	            else status[i] = "Obese";
	        }

	        System.out.println("\n--- BMI Report ---");
	        for (int i = 0; i < n; i++) {
	            System.out.println("Person " + (i + 1) +
	                               ": H=" + data[i][0] + "m, W=" + data[i][1] +
	                               "kg, BMI=" + String.format("%.2f", data[i][2]) +
	                               ", " + status[i]);
	        }
	}

}
