package control_flow;

import java.util.*;

public class largest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. 1= ");
		int n1 = input.nextInt();
		
		System.out.println("Enter no. 2= ");	
		int n2 = input.nextInt();
		
		System.out.println("Enter no. 3= ");
		int n3 = input.nextInt();
		
		int largest = n1;
		
		if(n2> largest) {
			largest = n2;
		}
		if(n3>largest) {
			largest = n3;
		}
		System.out.println("Is the first number the largest? " + (n1 == largest));
        System.out.println("Is the second number the largest? " + (n2 == largest));
        System.out.println("Is the third number the largest? " + (n3 == largest));
	}

}
