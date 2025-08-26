package control_flow;
import java.util.*;
public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter age= ");
		int age = input.nextInt();
		if(age>=18) {
			System.out.println("The person's age is "+ age + " and can vote");
		}
		else {
			System.out.println("The person's age is "+ age + " and cannot vote");
		}
	}

}
