public class reverseinteger {
    public static void main(String[] args) {
        int num = 12345;   // number to reverse
        int rev = 0;       // store reversed number

        while (num != 0) {
            int digit = num % 10;     // get last digit
            rev = rev * 10 + digit;   // add digit to reverse
            num = num / 10;           // remove last digit
        }

        System.out.println("Reversed Number = " + rev);
    }
}
