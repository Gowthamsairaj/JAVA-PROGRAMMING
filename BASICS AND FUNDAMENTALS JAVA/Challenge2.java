import java.util.Scanner;

class Challenge2{

     void passorfail(int num)
     {
          if(num >= 45)
          {
            System.out.println("pass");
          }
          else{
            System.out.println("fail");
          }
     }
    public static void main(String args[])
    {
       Challenge2 obj=new Challenge2();
       Scanner scan=new Scanner(System.in);
       int num1=scan.nextInt();
      
       obj.passorfail(num1);
        
      
    }
}