import java.util.Scanner;
class factorsofanumbers{
    public static void main(String[] sai){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }

    }
}