package practice_problem;
import java.util.*;
public class ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        double heightCm = input.nextDouble();
        double totalInches = heightCm / 2.54;
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12; 
        System.out.println("Your height in cm is " + heightCm + 
                " while in feet is " + feet + 
                " and inches is " + String.format("%.2f", inches));
	}

}
