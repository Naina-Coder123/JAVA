import java.util.*;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        } // using for each loop
        int max = 0;
        for (int m : arr) {
            if (m > max) {
                max = m;
            }
        }
        System.out.println(max);
    }
}
