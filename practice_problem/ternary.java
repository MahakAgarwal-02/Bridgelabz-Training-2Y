package practice;
import java.util.*;
public class ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int i =input.nextInt();
		int j =input.nextInt();
		int k =input.nextInt();
		int g = (i>j)?(i>k?i:k):(j>k?j:k);
		System.out.println(g);
	}

}
