package methods;
import java.util.Arrays;
public class level2_ques12 {
	public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000); 
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0];
        int sum = 0;

        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        double average = sum / (double) numbers.length;
        return new double[]{average, min, max};
    }
	public static void main(String[] args) {
	
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));

        double[] stats = findAverageMinMax(randomNumbers);
        System.out.println("Average = " + stats[0]);
        System.out.println("Minimum = " + stats[1]);
        System.out.println("Maximum = " + stats[2]);

	}

}
