public class largest_Number{
    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 11, 3};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Max = " + max);
    }
}
