import java.util.*;

public class Compliment {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = scn.nextInt();

        int out = ~x;
        System.out.println(out);
    }

}
