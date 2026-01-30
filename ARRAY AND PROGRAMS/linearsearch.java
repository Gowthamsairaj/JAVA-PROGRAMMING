// public class linearsearch {
//     public static void main(String[] args) {
//         int[] arr = {5, 9, 2, 11, 3};
//         int key = 11;
//         boolean found = false;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 System.out.println("Found at index " + i);
//                 found = true;
//                 break;
//             }
//         }

//         if (!found)
//             System.out.println("Not Found");
//     }
// }
import java.util.Scanner;
class linearsearch{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int [] arr={2,3,435,565,545,34,22,54,65,76,435,36,7,6,7,9,886,5343,23,2,5577,668};
        int key = scan.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
           if(key==arr[i]){
            System.out.println("Targeted value can be founded at index of "+i);
              found=true;
              break;
           }
          
          
        }
         if(!found)
           System.out.println("Not found");
    }
}