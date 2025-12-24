public class NumberCheckerThree {

    public static int getDigitCount(int number) {
        int digitCount = 0;
        while (number > 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }

    public static int[] getDigitArray(int number) {
        int countOfDigits = getDigitCount(number);
        int[] digits = new int[countOfDigits];

        for (int i = countOfDigits - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int[] getReverseArray(int[] digits) {
        int pointer1 = 0, pointer2 = digits.length - 1;

        while (pointer1 < pointer2) {
            int temp = digits[pointer1];
            digits[pointer1] = digits[pointer2];
            digits[pointer2] = temp;

            pointer1++;
            pointer2--;
        }

        return digits;
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = getReverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 121;
        int[] digits = getDigitArray(number);
        int[] reversed = getReverseArray(getDigitArray(number));

        System.out.print("Reversed Digits: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println(isPalindrome(getDigitArray(number)) + " Is Palindrome");
        System.out.println(isDuckNumber(digits) + " Is Duck Number");
    }
}