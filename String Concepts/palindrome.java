import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int start = 0;
        int end = s.length() - 1;
        boolean flag = true;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                flag = false;
                break;
            }
            start++;
            end--;
        }

        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
