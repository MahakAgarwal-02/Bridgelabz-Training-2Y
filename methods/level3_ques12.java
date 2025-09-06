package methods;
import java.util.*;
public class level3_ques12 {

	public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1); 
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        double distance = euclideanDistance(x1, y1, x2, y2);
        double[] line = lineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean distance between points: %.2f\n", distance);
        System.out.printf("Equation of line: y = %.2fx + %.2f\n", line[0], line[1]);
}
}