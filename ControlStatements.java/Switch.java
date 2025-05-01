import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to day of the week detector: ");
        System.out.println("Enter your day in number : ");
        int day = input.nextInt();
        // switch (day) {
        // case 1:
        // System.out.println("Today is Monday");
        // break;
        // case 2:
        // System.out.println("Today is Tuesday");
        // break;
        // case 3:
        // System.out.println("Today is Wednesday");
        // break;

        // case 4:
        // System.out.println("Today is Thursday");
        // break;

        // case 5:
        // System.out.println("Today is Friday");
        // break;
        // case 6:
        // System.out.println("Today is Saturday");
        // break;
        // case 7:
        // System.out.println("Today is Sunday");
        // break;
        // default:
        // System.out.println("Invalid number ");

        // }

        /// Enhanced switch
        newSwitch(day);
    }

    public static void newSwitch(int day) {
        String daystr = switch (day) {

            case 1 -> "Monday";
            case 2 -> "Tuesday";

            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Saturday";
            default -> "Invalid";

        };
        System.out.println(daystr);
    }

}
