package practice_problem;
import java.util.*;
public class yards_miles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;
        System.out.println("The distance in feet is " + distanceInFeet);
        System.out.println("The distance in yards is " + yards);
        System.out.println("The distance in miles is " + miles);
	}

}
