import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean[] visited = new boolean[256];
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}
