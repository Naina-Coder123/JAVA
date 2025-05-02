import java.util.*;

public class Occurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int s = input.nextInt();
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == s) {
                count++;
            }
        }
        System.out.println(count);
    }
}
