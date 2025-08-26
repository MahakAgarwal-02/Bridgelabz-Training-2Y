package control_flow;
import java.util.*;
public class match_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number= ");
		int n = input.nextInt();
		if(n<=0) {
			System.out.println("Please enter number greater than 0");
		}
		else {
			int formula = n*(n+1)/2;
			
			int whilesum = 0, i = 1;
			while(i<=n) {
				whilesum+=i;
				i++;
			}
			System.out.println("Sum using formula      : " + formula);
            System.out.println("Sum using while loop   : " + whilesum);
            
            if(formula == whilesum) {
            	System.out.println("Both computations are correct!");
            }
            else {
                System.out.println("Results do not match. Something is wrong.");
            }
		}

	}

}
