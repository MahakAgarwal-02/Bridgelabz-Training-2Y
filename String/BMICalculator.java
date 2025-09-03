package string;
import java.util.Scanner;
public class BMICalculator {
	    public static String[][] calculateBMIStatus(double[][] hw) {
	        int n = hw.length;
	        String[][] bmiStatus = new String[n][4];

	        for (int i = 0; i < n; i++) {
	            double weight = hw[i][0];
	            double heightCm = hw[i][1];
	            double heightM = heightCm / 100.0;
	            double bmi = weight / (heightM * heightM);
	            bmi = Math.round(bmi * 100.0) / 100.0;

	            String status;
	            if (bmi <= 18.4) status = "Underweight";
	            else if (bmi <= 24.9) status = "Normal";
	            else if (bmi <= 39.9) status = "Overweight";
	            else status = "Obese";

	            bmiStatus[i][0] = String.valueOf(weight);
	            bmiStatus[i][1] = String.valueOf(heightCm);
	            bmiStatus[i][2] = String.valueOf(bmi);
	            bmiStatus[i][3] = status;
	        }
	        return bmiStatus;
	    }

	    public static void displayBMIStatus(String[][] bmiStatus) {
	        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
	        System.out.println("-----------------------------------------------------");
	        for (int i = 0; i < bmiStatus.length; i++) {
	            System.out.printf("%-10s %-10s %-10s %-15s\n",
	                bmiStatus[i][0], bmiStatus[i][1], bmiStatus[i][2], bmiStatus[i][3]);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = 10;
	        double[][] hw = new double[n][2];

	        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
	        for (int i = 0; i < n; i++) {
	            System.out.printf("Person %d weight: ", i + 1);
	            hw[i][0] = sc.nextDouble();
	            System.out.printf("Person %d height: ", i + 1);
	            hw[i][1] = sc.nextDouble();
	        }

	        String[][] bmiStatus = calculateBMIStatus(hw);
	        displayBMIStatus(bmiStatus);
	}

}
