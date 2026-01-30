import java.util.Scanner;
public class Primecheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num = scan.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;  // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= num / 2; i++) 
            {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is NOT a prime number");
    }
}
