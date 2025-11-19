package SectionB;

import java.util.*;

public class UniqueDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] seen = new boolean[10];

        while (n > 0) {
            seen[n % 10] = true;
            n /= 10;
        }

        int count = 0;
        for (boolean x : seen)
            if (x) count++;

        System.out.println("Unique Digit Count = " + count);
    }
}

