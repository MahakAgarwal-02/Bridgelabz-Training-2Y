package methods;
import java.util.*;
public class level3_ques5 {
	
	public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num, sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, prod = 1, n = num;
        while (n != 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Prime? " + (isPrime(num) ? "Yes" : "No"));
        System.out.println("Neon? " + (isNeon(num) ? "Yes" : "No"));
        System.out.println("Spy? " + (isSpy(num) ? "Yes" : "No"));
        System.out.println("Automorphic? " + (isAutomorphic(num) ? "Yes" : "No"));
        System.out.println("Buzz? " + (isBuzz(num) ? "Yes" : "No"));
	}

}
