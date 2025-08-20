package practice_problem;
import java.util.*;
public class ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double fee = input.nextDouble();
		double discountPercent = input.nextDouble();
		double discount = (fee * discountPercent)/100;
		double discountedPrice = fee - discount;
		System.out.print("The discount amount is INR "+ discount +" and final discounted fee is INR "+ discountedPrice);

	}

}
