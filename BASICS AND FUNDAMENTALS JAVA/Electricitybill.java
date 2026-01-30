import java.util.Scanner;
class Electricitybill{
    public static void main(String []sairaj){
        Scanner scan=new Scanner(System.in);
    
        int units=scan.nextInt();
        int bill=0;

        if(units<=100){
            bill=units*1;
        }
        else if (units<=200){
            bill=(100*1)+(units-100)*2;

        }
         else{
            bill=(100*1)+(100*2)+(units-200)*3;
         }

         System.out.println(bill);
    }
}