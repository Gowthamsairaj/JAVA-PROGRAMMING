import java.util.Scanner;

class Challenge1{

     void evenorodd(int num)
     {
          if(num%2 == 0)
          {
            System.out.println("even number");
          }
          else{
            System.out.println("odd number");
          }
     }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Challenge1 obj=new Challenge1();
        int remain=scan.nextInt();
        obj.evenorodd(remain);
        
      
    }
}