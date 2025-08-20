package practice_problem;
import java.util.*;
public class ques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int price = input.nextInt();
		int qty = input.nextInt();
		int total = price*qty;
		System.out.print("The total purchase price is INR "+total+" if the quantity "+qty+" and unit price is INR "+price);
	}

}
