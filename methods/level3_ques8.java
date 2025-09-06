package methods;
import java.util.HashSet;
import java.util.Set;
public class level3_ques8 {

	public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); 
    }

    public static boolean areUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) set.add(otp);
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println(otpArray[i]);
        }

        if (areUnique(otpArray)) System.out.println("All OTPs are unique!");
        else System.out.println("Duplicate OTPs found!");

	}

}
