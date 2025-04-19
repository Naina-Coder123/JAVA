import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(pal(652));
    }

    public static boolean pal(int num) {
        int original = num;
        int rev = 0;
        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
        if (original == rev) {
            return true;

        } else
            return false;
    }
}
