import java.util.*;

public class Stringques {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextLine();
        }
        int d = scn.nextInt();
        scn.nextLine();
        String[] array = new String[0];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    array[k] = arr[i];

                    k++;
                }
            }
        }
        System.out.println(array[d - 1]);
    }
}
