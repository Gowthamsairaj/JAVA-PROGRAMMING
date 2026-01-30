import java.util.Arrays;

class built_in_functions{
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 6};

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 9);
        System.out.println("Index of 5: " + index);

        int[] copyArr = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copyArr));

        Arrays.fill(copyArr, 10);
        System.out.println("Filled Array: " + Arrays.toString(copyArr));

        boolean same = Arrays.equals(arr, copyArr);
        System.out.println("Arrays are equal: " + same);
    }
}
