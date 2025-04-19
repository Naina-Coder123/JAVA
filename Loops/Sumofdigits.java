import java.util.*;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = sumOfdigits(number);
        System.out.println(result);

    }

    public static int sumOfdigits(int num) {
        int sum = 0;
        while (num != 0) {
            int d = num % 10;
            sum += d;
            num /= 10;

        }
        return sum;
    }
}
