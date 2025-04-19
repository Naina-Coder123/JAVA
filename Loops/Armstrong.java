import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(armstring(370));
    }

    public static boolean armstring(int num) {
        int orignal = num;
        int sum = 0;
        int n = count(num);

        while (num != 0) {
            int d = num % 10;
            sum += Math.pow(d, n);
            num /= 10;

        }
        if (sum == orignal) {
            return true;

        } else
            return false;

    }

    public static int count(int num) {
        int count = 0;
        while (num != 0) {
            int d = num % 10;
            count++;
            num /= 10;

        }
        return count;
    }
}
