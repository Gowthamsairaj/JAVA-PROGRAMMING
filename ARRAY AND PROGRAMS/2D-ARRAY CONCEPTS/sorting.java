import java.util.Scanner;
class sorting{
    public static void main (String []sairaj){
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        int c=scan.nextInt();
        int [][]a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            {
                a[i][j]=scan.nextInt();
         }
        }

        for(int i1=0;i1<r;i1++)
        {
            for(int j1=0;j1<c;j1++)
            {
                for(int i2=0;i2<r;i2++){
                    for(int j2=0;j2<c;j2++)
                    {
                        if(a[i1][j1]<a[i2][j2]){
                        a[i1][j1]=a[i1][j1] ^ a[i2][j2];
                        a[i2][j2]=a[i1][j1] ^ a[i2][j2];      
                        a[i1][j1]=a[i1][j1] ^ a[i2][j2];
                        }
                    }
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
             System.out.print(a[i][j]+" ");
            }
            System.out.println();
    }
 }
}