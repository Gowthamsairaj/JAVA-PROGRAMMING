// import java.util.Scanner;
// class gcdoftwonumber{
//         public static void main(String[]args)
//         {
//             Scanner scan=new Scanner(System.in);
//             int a=scan.nextInt();
//             int b=scan.nextInt();
//               int gcd=1;
//               int i=1;
//             while(i<=a&&i<=b){
//                 if(a%i==0 && b%i==0){

//                     gcd=i;

//                 }
//                 i++;
//             }
            
            
//             if(a%gcd==0 && b%gcd==0){
//                 System.out.println("GCD OF TWO NUMBER IS " +gcd);
//             }
//             else{
//                 System.out.println("The number doest not have GCD");
//             }   
            
            
//         }
// }

// Euclid method to find GCD of TWO NUMBERS
import java.util.Scanner;

class GCD {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
    }
}



// import java.util.Scanner;
// class coprime{
//     public static void main(String []args){

//     Scanner scan= new Scanner(System.in);
//         int a=scan.nextInt();
//         int b =sca.nextInt();
//         int gcd=1;
//        while(i<=a&&i<=b){
//         if(a%i==0 && b%i==0){
//             gcd=i;
            
//         }
//         i++;
//        }
//        if(gcd==1){
//         System.out.println("The given number is co-prime");
//        }
//        else{
//         System.out.println("The give number is not a co-prime");
//        }

//     }
// }