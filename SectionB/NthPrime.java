package SectionB;

import java.util.*;

public class NthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0, num = 1;

        while (count < n) {
            num++;
            if (isPrime(num))
                count++;
        }

        System.out.println("Nth Prime = " + num);
    }

    static boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i * i <= x; i++)
            if (x % i == 0) return false;
        return true;
    }
}

