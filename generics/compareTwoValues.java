package generics;

class Util {

    public static <T> boolean isEqual(T a, T b) {
        if (a == null && b == null) return true;  
        if (a == null || b == null) return false; 
        return a.equals(b);
    }
}

public class compareTwoValues {
	public static void main(String[] args) {

        System.out.println(Util.isEqual(10, 10));           // true
        System.out.println(Util.isEqual("hello", "hello")); // true
        System.out.println(Util.isEqual(10.5, 10.6));       // false
        System.out.println(Util.isEqual(null, "text"));     // false
    }
}
