import java.util.*;

public class Positive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                continue;
            }
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
