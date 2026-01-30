import java.util.Scanner;

public class switchcase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a = 10, b = 5;
        System.out.println("Enter the operation like +,-,*,/");
        char op = sc.next().charAt(0);  // change to -, *, or /

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
