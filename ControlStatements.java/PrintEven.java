import java.util.*;

public class PrintEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}
