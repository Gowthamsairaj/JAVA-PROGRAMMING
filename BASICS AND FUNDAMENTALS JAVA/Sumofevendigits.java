import java.util.Scanner;
class Sumofevendigits{
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int num=scan.nextInt();
        
        while(num!=0){
          int  digit=num%10;
            if(digit%2==0){
                sum=sum+digit;

            }
            num=num/10;
           
        }
        System.out.println(sum);
    }
}