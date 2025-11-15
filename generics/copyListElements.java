package generics;
import java.util.*;


public class copyListElements {
	public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number num : src) {
            dest.add(num);
        }
    }

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(1.5, 2.5);

        List<Number> destList = new ArrayList<>();

        copyList(destList, intList);
        copyList(destList, doubleList);

        System.out.println("Destination List After Copy: " + destList);
    }
}
