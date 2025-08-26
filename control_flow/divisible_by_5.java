package control_flow;


import java.util.*;
public class divisible_by_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();
		if(n%5==0) {
			System.out.println("Is the number "+ n + " divisible by 5? Yes");
		}
		else {
			System.out.println("Is the number "+ n + " divisible by 5? No");
		}
	}

}
