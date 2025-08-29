package arrays;
import java.util.*;
public class level1_ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ages[] = new int[10];
		
		System.out.println("Enter the ages of 10 students: ");
		for(int i = 0; i<ages.length; i++) {
			System.out.println("Enter age of student " + (i+1) + ": ");
			ages[i] = input.nextInt();
		}
		
		System.out.println("\nVoting Eligibility Results:");
		for(int i =0; i<ages.length; i++) {
			int age = ages[i];
			if(age<0) {
				System.out.println("Invalid age entered for student " + (i + 1));
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            
			}
		}
	}

}
