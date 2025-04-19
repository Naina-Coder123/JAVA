import java.util.*;

public class Multiplicationtable {
    public static void main(String[] args) {
        table(4);
    }

    public static void table(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "* " + i + "=" + num * i);
            i++;
        }

    }
}
