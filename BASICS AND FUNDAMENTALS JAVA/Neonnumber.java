import java.util.Scanner;
public class Neonnumber {
    public static void main(String[]sairaj){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
    
        int c1=a*a;
        int org=a;
        int temp=c1;
        int res=0;
        while(temp!=0){
            int digit=temp%10;
             res=res+digit;
              temp=temp/10;
            
        }
        
        if(res==org){
            System.out.println("The given number is NEON NUMBER");

        }
        else
          System.out.println("The given number is not a NEON NUMBER");
    }
}
