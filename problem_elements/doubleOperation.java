package practice_problem;
import java.util.*;
public class doubleOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter value for b: ");
        double b = input.nextDouble();
        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        double result1 = a + b * c;    
        double result2 = a * b + c;     
        double result3 = c + a / b;  
        double result4 = a % b + c;   
        
        System.out.print("The results of Int Operations are "+result1+" , "+result2+" , "+result4+" ,and "+result4);
	}

}
