package ElementaryCoding;

import java.util.*;

public class CountEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0)
                even++;
        }

        System.out.println("Even Count = " + even);
    }
}
