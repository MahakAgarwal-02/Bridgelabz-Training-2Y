package practice_problem;

public class ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fee = 125000;
		double discountPercent = 10;
		double discount = (fee * discountPercent)/100;
		double discountedPrice = fee - discount;
		System.out.print("The discount amount is INR "+ discount +" and final discounted fee is INR "+ discountedPrice);

	}

}
