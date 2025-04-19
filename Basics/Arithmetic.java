import java.util.*;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter your first number :");
        int x=scn.nextInt();
        System.out.println("Enter your second number :");
        int y=scn.nextInt();
        int sum=x+y;
        System.out.println(sum);
        int sub=x-y;
        System.out.println(sub);
        int mult=x*y;
        System.out.println(mult);
        int div=x/y;
        System.out.println(div);
        int mod=x%y;
        System.out.println(mod);

    }
}
