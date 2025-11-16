package collections;

import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));

        int N = 2;  

        String result = findNthFromEnd(list, N);

        System.out.println("Nth element from end: " + result);
    }

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {

        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                return null; 
            }
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }
}
