import java.util.Scanner;

class PowerOfnumbers{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long base = scan.nextInt();   
        long exponent = scan.nextInt(); 
        long result = 1;

        for (long i = 1; i <= exponent; i++) {
            result = result * base;
        }

        System.out.println("Result = " + result);
    }
}
