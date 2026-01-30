import java.util.Scanner;
class minnumber{
    public static void main(String []args){
        Scanner scan= new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int min=arr[0];

        for(int i=1;i < arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
            
            
        }
        System.out.println(min);
    }
}