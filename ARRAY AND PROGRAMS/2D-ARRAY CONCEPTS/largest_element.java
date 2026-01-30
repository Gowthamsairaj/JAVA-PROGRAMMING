import java.util.Scanner;
public class largest_element{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        int c=scan.nextInt();
        int[][] a= new int[r][c];
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
              a[i][j]=scan.nextInt();
    }
}
              int largest = a[0][0];
        

        for (int i = 0; i <r; i++) {
            for(int j=0;j<c;j++){

            if (a[i][j] > largest) {
                
                largest = a[i][j];
            } 
        }
        }

        System.out.print(largest);
    }
}
