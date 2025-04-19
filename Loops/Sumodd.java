import java.util.*;

public class Sumodd {
    public static void main(String[] args) {
        int sum = sumOdd(10);
        System.out.println(sum);
    }

    public static int sumOdd(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;

            }
        }
        return sum;

    }
}
