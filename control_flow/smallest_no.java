package control_flow;
import java.util.*;
public class smallest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. 1= ");
		int n1 = input.nextInt();
		
		System.out.println("Enter no. 2= ");	
		int n2 = input.nextInt();
		
		System.out.println("Enter no. 3= ");
		int n3 = input.nextInt();
		
		if(n1<n2 && n1<n3) {
			System.out.println("Is the first number the smallest? "+ "Yes");
		}
		else {
			System.out.println("Is the first number the smallest? "+ "No");
		}

	}

}
