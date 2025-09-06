package methods;
import java.util.*;
public class level1_ques1 {
	static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100; }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double si = calculateSI(principal, rate, time);

        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
	}

}
