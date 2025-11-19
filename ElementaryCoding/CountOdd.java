package ElementaryCoding;

import java.util.*;

public class CountOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int odd = 0;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0)
                odd++;
        }

        System.out.println("Odd Count = " + odd);
    }
}
