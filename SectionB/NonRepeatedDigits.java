package SectionB;

import java.util.*;

public class NonRepeatedDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] freq = new int[10];

        int temp = n;
        while (temp > 0) {
            freq[temp % 10]++;
            temp /= 10;
        }

        int count = 0;
        for (int f : freq)
            if (f == 1) count++;

        System.out.println("Non-Repeated Digit Count = " + count);
    }
}

