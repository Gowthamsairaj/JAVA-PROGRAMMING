import java.util.Scanner;

public class MAXNUMBERUSINGFUNC{

    static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int result = findMax(x, y, z);
        System.out.println(result);
    }
}
