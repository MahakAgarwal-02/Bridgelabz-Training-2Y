package control_flow;

import java.util.Scanner;

public class sum0f_natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number+ ");
		int n = input.nextInt();
		if(n>=0) {
			int sum = n*(n+1)/2;
			System.out.println("The sum of "+ n +" natural number is "+ sum);
		}
		else {
			System.out.println("The number "+ n +" is not a natural number");
		}

	}

}
