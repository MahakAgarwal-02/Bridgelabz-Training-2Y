package arrays;
import java.util.*;
public class level2_ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next(); 

        int[] freq = new int[10]; 
        int[] digits = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            digits[i] = num.charAt(i) - '0';
            freq[digits[i]]++;
        }

        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " -> " + freq[i] + " times");
            }
        }
	}

}
