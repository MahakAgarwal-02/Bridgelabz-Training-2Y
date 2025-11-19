package ElementaryCoding;

import java.util.*;

public class ExactMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        if (N % M == 0)
            System.out.println("YES, " + N + " is an exact multiple of " + M);
        else
            System.out.println("NO, " + N + " is not a multiple of " + M);
    }
}
