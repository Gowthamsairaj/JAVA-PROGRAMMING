import java.util.*;

public class sorting_ascending_order{
    public static void main(String[] args) {
        int[] arr = {23,44,36,1,87,54,90,934,2,5};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // temp = arr[i];
                    // arr[i] = arr[j];
                    // arr[j] = temp;
                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[i]^arr[j];
                    arr[i]=arr[i]^arr[j];
                }
        }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
