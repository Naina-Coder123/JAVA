import java.util.*;

public class MulttiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        multiplication(number);

    }

    public static void multiplication(int num) {
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " *" + i + "=" + num * i);
        }
    }
}
