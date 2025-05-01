import java.util.*;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int num = input.nextInt();
        if (num == 0) {
            System.out.println("No absolute value for 0");
        } else if (num < 0) {
            num = -1 * num;
            System.out.println("+" + num);
        } else {
            System.out.println("+" + num);
        }
    }
}
