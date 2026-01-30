import java.util.Scanner;

class ANAGRAM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] count = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        boolean flag = true;
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
