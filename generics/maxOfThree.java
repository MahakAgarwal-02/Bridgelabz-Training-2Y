package generics;

class Util {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; 

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
}

public class maxOfThree {
	public static void main(String[] args) {

        System.out.println("Max of 3, 7, 5: " + Util.maximum(3, 7, 5));
        System.out.println("Max of 6.6, 8.8, 7.7: " + Util.maximum(6.6, 8.8, 7.7));
        System.out.println("Max of pear, apple, orange: " + Util.maximum("pear", "apple", "orange"));
    }
}
