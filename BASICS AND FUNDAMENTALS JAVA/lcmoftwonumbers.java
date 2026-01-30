import java.util.Scanner;
class lcmoftwonubers{
    public static void main(String[] sairaj){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int min=(a < b)?a:b;
        int gcd=1;
         
        for(int i=min; i>=1;i--){
            if(a%i==0 && b%i==0){
                gcd=i;
                break;
            }

        }
        int lcm=(a*b)/gcd;
        System.out.println("The LCM of Two number is "+lcm);
    }
}