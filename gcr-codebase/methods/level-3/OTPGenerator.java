public class OTPGenerator {

    public static String generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000;
        return String.valueOf(otp);
    }

    public static boolean checkUniqueness(String[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i].equals(otps[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] otps = new String[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (String otp : otps) {
            System.out.println(otp);
        }

        boolean isUnique = checkUniqueness(otps);
        System.out.println("Are all OTPs unique? " + isUnique);
    }
}