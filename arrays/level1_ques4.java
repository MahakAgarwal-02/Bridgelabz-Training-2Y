package arrays;
import java.util.*;
public class level1_ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];  
        double total = 0.0;              
        int index = 0;                    

        System.out.println("Enter numbers (max 10). Enter 0 or a negative number to stop:");

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\n\nSum of all numbers = " + total);

	}

}
