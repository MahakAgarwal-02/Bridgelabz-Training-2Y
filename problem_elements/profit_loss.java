package practice_problem;

public class profit_loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost_price = 129;
		int sell_price = 191;
		int profit = sell_price-cost_price;
		double percentage = (profit/(double)cost_price)*100;
		
		System.out.println("The cost price is INR "+cost_price +" and Selling price is INR "+sell_price+ "\n The profit is INR "+profit+" and the profit percentage is "+ percentage);
	}

}
