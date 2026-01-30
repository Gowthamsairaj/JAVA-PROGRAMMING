import java.util.Scanner;

class count_prime_sum {
    public static void main(String[] sairaj) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            int f = 1;

            if (sum <= 1) {
                f = 0;
            } else {
                for (int j = 2; j <= sum / 2; j++) {
                    if (sum % j == 0) {
                        f = 0;
                        break;
                    }
                }
            }

            if (f == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
