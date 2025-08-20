package practice_problem;
import java.util.*;
public class intOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        System.out.print("Enter value for c: ");
        int c = input.nextInt();

        int result1 = a + b * c;    
        int result2 = a * b + c;     
        int result3 = c + a / b;  
        int result4 = a % b + c;   
        
        System.out.print("The results of Int Operations are "+result1+" , "+result2+" , "+result4+" ,and "+result4);
	}

}
