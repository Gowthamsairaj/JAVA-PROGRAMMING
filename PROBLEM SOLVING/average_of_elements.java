import java.util.Scanner;
class average_of_elements{
    public static void main(String []sairaj){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[]a=new int[n];
        for(int i=0;i<a.length;i++){
            
            a[i]=scan.nextInt();

        }
        System.out.print("The Average of elements in the array are ");
        int sum=0;

        for(int i=0;i<a.length;i++)
        {
           sum=sum+a[i];   
        }
        double average=(double)sum/a.length;
          System.out.print(average);
    }
}