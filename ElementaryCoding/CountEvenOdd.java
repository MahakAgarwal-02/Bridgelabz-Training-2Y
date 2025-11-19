package ElementaryCoding;

import java.util.*;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0, odd = 0;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Count = " + even);
        System.out.println("Odd Count  = " + odd);
    }
}
