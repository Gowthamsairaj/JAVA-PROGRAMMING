import java.util.Scanner;
import java.util.Arrays;
class EvenAndOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(a));
    }
}


//         int evenSum = 0;
//         int oddSum = 0;

//         System.out.println("Even numbers in array:");
//         for (int i = 0; i < n; i++) {
//             if (a[i] % 2 == 0) {
//                 System.out.print(a[i] + " ");
//                 evenSum += a[i];
//             }
//         }

//         System.out.println("\nOdd numbers in array:");
//         for (int i = 0; i < n; i++) {
//             if (a[i] % 2 != 0) {
//                 System.out.print();
//                 oddSum += a[i];
//             }
//         }

//         System.out.println("\nSum of even numbers: " + evenSum);
//         System.out.println("Sum of odd numbers: " + oddSum);
//     }
// }



// [1,2,3,4,5]

// [1,3,5]
// [2,4]