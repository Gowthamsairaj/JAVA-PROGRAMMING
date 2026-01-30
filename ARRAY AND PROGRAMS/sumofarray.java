import java.util.Scanner;
class sumofarray{
    public static void main(String[]sairaj){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] p=new int[n];
        for(int i=0;i<n;i++)
        {
            p[i]=scan.nextInt();
        }
          int sum=0;
          for(int i=0;i<n;i++){
              sum =sum+p[i];
        }
        System.out.println(sum);
        
    }
}