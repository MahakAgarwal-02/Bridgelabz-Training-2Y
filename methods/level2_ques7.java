package methods;
import java.util.*;
public class level2_ques7 {

	public boolean canStudentVote(int age) {
        if (age < 0) return false;      
        return age >= 18;              
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		level2_ques7 checker = new level2_ques7();

        int[] ages = new int[10];  

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            if (checker.canStudentVote(ages[i]))
                System.out.println("Student " + (i + 1) + " CAN vote.");
            else
                System.out.println("Student " + (i + 1) + " CANNOT vote.");
        }
	}

}
