package ElementaryCoding;

import java.util.*;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int last = num % 10;

        System.out.println("Last Digit = " + last);
    }
}
