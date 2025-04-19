import java.util.*;

public class LcmandHcf {
    public static void main(String[] args) {
        System.out.println(LCM(45, 15));
        System.out.println(HCF(15, 20));

    }

    public static int LCM(int a, int b) {
        int i = 1;
        while (i <= b) {
            int fact = a * i;
            if (fact % b == 0) {
                return fact;
            }
            i++;
        }
        return 0;

    }

    public static int HCF(int a, int b) {
        int gcd = 1;
        int i = 2;
        int least = least(a, b);
        while (i <= least) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int a, int b) {
        if (a < b) {
            return a;
        } else
            return b;
    }
}
