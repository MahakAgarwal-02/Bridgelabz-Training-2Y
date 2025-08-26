package control_flow;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter year = ");
		int n = input.nextInt();
		if((n%4==0 && n%100!=0 )|| n%400==0 ) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

}
