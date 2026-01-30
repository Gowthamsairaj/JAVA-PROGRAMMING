import java.util.Scanner;
class coprime{
    public static void main(String []args){

    Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        int b =scan.nextInt();
        int gcd=1;
        int i=0;
       while(i<=a&&i<=b){
        if(a%i==0 && b%i==0){
            gcd=i;
            
        }
        i++;
       }
       if(gcd==1){
        System.out.println("The given number is co-prime");
       }
       else{
        System.out.println("The give number is not a co-prime");
       }

    }
}