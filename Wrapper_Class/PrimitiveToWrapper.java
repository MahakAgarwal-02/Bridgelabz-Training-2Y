package Wrapper_Class;
import java.util.*;
class PrimitiveToWrapper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();   

        Integer obj = Integer.valueOf(num);  

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object value: " + obj);
	}

}
