package Wrapper_Class;
import java.util.*;
public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(10);
		numbers.add(15);
		
		int sum = 0;
		
		for(int n : numbers) {
			sum+= n;
		}
		
        System.out.println("Sum of numbers = " + sum);
	}

}
