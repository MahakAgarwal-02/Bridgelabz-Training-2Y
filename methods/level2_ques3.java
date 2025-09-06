package methods;
import java.util.*;
public class level2_ques3 {
	static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 System.out.print("Enter a year: ");
	        int year = sc.nextInt();
		if (isLeapYear(year))
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is NOT a Leap Year.");
	}

}
