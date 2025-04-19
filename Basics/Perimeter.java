import java.util.*;
public class Perimeter {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int perimeter=2*(a+b);
        System.out.println("Here is your perimeter :");
        System.out.println(perimeter);
        int areaOftriangle=(a*b)/2;
        System.out.println(areaOftriangle);
    }
}
