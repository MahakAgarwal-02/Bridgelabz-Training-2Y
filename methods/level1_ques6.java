package methods;
import java.util.*;
public class level1_ques6 {
	static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        int sum = findSum(n);

        System.out.println("The sum of first " + n + " natural numbers is: " + sum);


	}

}
