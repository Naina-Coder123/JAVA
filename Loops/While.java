import java.util.*;

public class While {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int i = 0;
        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }
}
