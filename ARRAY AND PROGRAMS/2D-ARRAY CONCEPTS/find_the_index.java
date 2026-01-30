import java.util.Scanner;
class find_the_index{
    public static void main(String[]sairaj)
    {
         Scanner scan=new Scanner(System.in);
         int r=scan.nextInt();
         int c=scan.nextInt();
         int [][]a=new int [r][c];
         for(int i=0;i<r;i++)
           for(int j=0;j<c;j++)
              a[i][j]=scan.nextInt();


          int key=scan.nextInt();
          boolean found=false;
         for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
            if(a[i][j]==key)
            {
                System.out.print("Found at the index+:("+i+","+j+")");
                found=true;

            }

           }
           
         }
         if(!found)
         {
            System.out.print("ELEMENT NOT FOUND");}
    }
}