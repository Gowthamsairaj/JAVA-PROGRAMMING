import java.util.Scanner;
class print_odd_elements{
    public static void main(String []sairaj){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[]a=new int[n];
        for(int i=0;i<a.length;i++){
            
            a[i]=scan.nextInt();

        }
        System.out.print("The odd elements in the array are ");

        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0)
            {
               System.out.print(a[i]+" ");
            }
            else
             System.out.print(0);
             break;
        }

    }
}