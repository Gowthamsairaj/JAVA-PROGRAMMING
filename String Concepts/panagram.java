import java.util.Scanner;

class panagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        boolean[] mark = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                mark[ch - 'a'] = true;
            }
        }

        boolean pangram = true;
        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                pangram = false;
                break;
            }
        }

        if (pangram)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
    }
}
