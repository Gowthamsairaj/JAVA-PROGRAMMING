import java.util.Scanner;
class print_the_diagonal_element{
    Scanner scan=new Scanner(System.in);
    int r=scan.nextInt();
    int c=scan.nextInt();
    int [][]a=new int[r][c];
      for(int i=0;i<r;i++)
     {    
        for(int j=0;j<c;j++)
        {
            a[i][j]=scan.nextInt();
        }

         for(int i=0;i<r;i++)
         {
            for(int j=0;j<c;j++)
            {
               for(int i1=0;i1<r;i1++)
               {
                for(int j1=0;j1<c;j1++)
                {
                  if(a[i!=r][j!=c]!=a[i1==r][j1==c])
                  {
                    
                    System.out.print(a[i][j]);

                    
                  }
                }
                System.out.println();
               }
            }
         }
    }

}