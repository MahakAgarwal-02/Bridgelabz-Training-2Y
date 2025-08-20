package practice_problem;
import java.util.*;
public class areaOFtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double height = input.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;

        System.out.println("The area of the triangle is " + areaInInches + " square inches.");
        System.out.println("The area of the triangle is " + areaInCm + " square centimeters.");
    
	}

}
