import java.util.*;

public class StudentScore {

    public static String Score(int score) {
        if (score < 0) {
            return "Invalid";
        } else {
            // (score>80)?return "High";:((score>50 && score<80)?"Moderate": return "Low");
            return (score > 80) ? "High" : ((score > 50 && score < 80) ? "Moderate" : "Low");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score of the student :");
        int score = input.nextInt();
        System.out.println(Score(score));

    }

}