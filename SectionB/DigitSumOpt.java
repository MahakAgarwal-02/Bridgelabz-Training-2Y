package SectionB;

import java.util.*;

public class DigitSumOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number
        int choice = sc.nextInt(); // 1 = even, 2 = odd

        int sum = 0;

        while (n > 0) {
            int d = n % 10;

            if (choice == 1 && d % 2 == 0)
                sum += d;

            if (choice == 2 && d % 2 != 0)
                sum += d;

            n /= 10;
        }

        System.out.println("Result = " + sum);
    }
}

