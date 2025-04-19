import java.util.*;

public class LearningIf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean isMale = false;
        System.out.println("Enter the name :");
        String name = scn.nextLine();
        if (isMale) {
            System.out.println("Mr." + name);
        } else {
            System.out.println("Ms. " + name);
        }
    }
}
