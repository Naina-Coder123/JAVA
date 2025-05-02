
import java.util.*;

public class Course {
    String courseName;
    int enrolledStudents;
    static int maxCapacity;

    void enrollStudent(String studentName) {
        if (enrolledStudents < maxCapacity) {
            enrolledStudents++;
            System.out.println("StudentName :" + studentName);
        } else {
            System.out.println("Students cannot be enrolled");
        }
    }

    void unenrollStudent(String studentName) {
        if (enrolledStudents > 0) {
            enrolledStudents--;
            System.out.println("StudentName: " + studentName);
        } else {
            System.out.println("Students can not be enrolled");
        }
    }

    static void getMaxCapacity(int capacity) {
        System.out.println("Max capacity of students is 100");
    }

    public static void main(String[] args) {
        Course DSA = new Course();
        DSA.courseName = "Data Structures and Algorithms";
        DSA.enrolledStudents = 25;

        System.out.println(DSA.enrolledStudents + DSA.courseName);
        DSA.enrollStudent("Naina Mishra");
        DSA.unenrollStudent("Deepa Patel");
        getMaxCapacity(maxCapacity);
    }

}
