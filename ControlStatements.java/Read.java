import java.util.*;

public class Read {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int pass;
        while (true) {
            pass = scn.nextInt();
            if (pass == number) {
                System.out.println("Exit");
                break;
            }
        }
    }
}
