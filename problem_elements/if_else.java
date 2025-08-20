package practice_problem;
import java.util.Scanner;
public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		   int marks =sc.nextInt();
		   char grades;
		   if(marks >= 40 && marks <=50){
		      grades = 'E';
		   }
		   else if(marks >= 50 && marks<=60)
			   grades = 'D';
		   else if(marks>=60 && marks<=70)
			   grades ='C';
		   else if(marks>=70 && marks<=80)
			   grades = 'B';
		   else if(marks>=80 && marks<=90)
			   grades = 'A';
		   else if(marks>=90 && marks<=100)
			   grades = 'O';
		   else grades = 'F';
		   System.out.print(grades);
          sc.close();
	}

}
