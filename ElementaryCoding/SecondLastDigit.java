package ElementaryCoding;

import java.util.*;

public class SecondLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int secondLast = (num / 10) % 10;

        System.out.println("Second Last Digit = " + secondLast);
    }
}
