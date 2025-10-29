package Wrapper_Class;

public class WrapperUtilityMethods {

	public static void main(String[] args) {

		int num = Integer.parseInt("123");
		System.out.println(num);
		
		double d = Double.parseDouble("3.14");
		System.out.println(d);
		
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		
		String binary = Integer.toBinaryString(10);
		System.out.println(binary);
		
		boolean isDigit = Character.isDigit('5');
		System.out.println(isDigit);
		
		char upper = Character.toUpperCase('a');
		System.out.println(upper);
	}

}
