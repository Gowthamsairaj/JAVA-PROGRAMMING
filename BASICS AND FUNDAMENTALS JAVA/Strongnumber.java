import java.util.*;
class factorsofanumbers{
    public static void main(String[] sai){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int org=num;
        int sum=0;
        int digit=0;
       
         int f=1;
        while(num!=0){
           digit=num%10;
             f=1;
         
            for(int i=1;i<=digit;i++){
             f*=i;
            }
          
           
           sum+=f;
          num=num/10;
            

        }

        if(sum==org){
            System.out.println("The give number is Strong number");
        }
        else
          System.out.println("The given number is not a Strong number");
    }
}