import java.util.*;

public class Isfound {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 3, 6, 7, 1 };
        int num = 2;
        System.out.println(isFound(arr, num));
    }

    public static boolean isFound(int[] arr, int num) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == num) {
                return true;
            }
            i++;
        }
        return false;
    }
}
