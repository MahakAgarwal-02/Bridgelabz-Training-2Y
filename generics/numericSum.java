package generics;
import java.util.*;


public class numericSum {
	public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();  

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10, 20, 30, 40);
        System.out.println("Sum of Integer list: " + sumNumbers(intList));

        List<Double> doubleList = Arrays.asList(5.5, 3.3, 1.2);
        System.out.println("Sum of Double list: " + sumNumbers(doubleList));
    }
}
