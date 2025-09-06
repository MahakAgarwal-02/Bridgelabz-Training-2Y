package methods;
import java.util.*;
public class level1_ques4 {

	static int checkNumber(int n) {
        if (n > 0)
            return 1;   // Positive
        else if (n < 0)
            return -1;  // Negative
        else
            return 0;   // Zero
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = checkNumber(number);

        if (result == 1)
            System.out.println(number + " is Positive.");
        else if (result == -1)
            System.out.println(number + " is Negative.");
        else
            System.out.println("The number is Zero.");
	}

}
