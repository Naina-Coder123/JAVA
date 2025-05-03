import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 2, 3, 7 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println(Arrays.binarySearch(arr, 3));
    }
}
