import java.util.*;

public class Rightshift {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = scn.nextInt();
        System.out.println("Ente the number : ");
        int y = scn.nextInt();
        int out = x >> y;
        System.out.println(out);
    }

}
