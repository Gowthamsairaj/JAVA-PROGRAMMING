import java.util.Scanner;
class factusingwhile{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       int f=1;
       int i = 1;
        while(i<=n){
            f=f*i;
            i++;
        }
       System.out.println(f);
    }
}