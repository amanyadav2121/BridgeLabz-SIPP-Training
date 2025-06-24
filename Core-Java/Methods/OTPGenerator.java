package Methods;

import java.util.Arrays;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        
        System.out.println("OTPs:");
        for (int otp : otps) System.out.println(otp);
        
        System.out.println("All unique: " + areUnique(otps));
    }

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean areUnique(int[] otps) {
        Arrays.sort(otps);
        for (int i = 1; i < otps.length; i++) {
            if (otps[i] == otps[i-1]) return false;
        }
        return true;
    }
}