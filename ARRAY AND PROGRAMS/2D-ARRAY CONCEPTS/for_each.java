import java.util.Scanner;
class for_each{
    public static void main(String[]sairaj){
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        int c=scan.nextInt();
        int [][]a=new int[r][c];
        for(int i=0;i<r;i++)
           for(int j=0;j<c;j++)
             a[i][j]=scan.nextInt();


        for(int []i:a)
        for(int j:i)
          System.out.print(j+" ");
    }
}