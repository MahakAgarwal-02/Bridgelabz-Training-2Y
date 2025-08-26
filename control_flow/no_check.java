package control_flow;
import java.util.*;
public class no_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number= ");
		int n = input.nextInt();
		if(n<0) {
			System.out.println("Negative no.");
		}
		else if(n>=0) {
			System.out.println("Positive no.");
		}
		else if(n==0) {
			System.out.println("Zero");
		}
	}

}
