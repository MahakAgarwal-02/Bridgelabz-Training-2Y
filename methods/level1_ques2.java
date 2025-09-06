package methods;
import java.util.*;
public class level1_ques2 {
	
	 static int Handshakes(int n) {
	        return (n * (n - 1)) / 2;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int no_OfStudents = sc.nextInt();

        int handshakes = Handshakes(no_OfStudents);

        System.out.println("The maximum number of possible handshakes is: " + handshakes);
	}

}
