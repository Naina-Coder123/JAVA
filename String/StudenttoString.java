
import java.util.*;

public class StudenttoString {
    String name;
    int age;

    public StudenttoString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        StudenttoString student = new StudenttoString("Naina", 20);
        student.name = "Naina";
        student.age = 20;
        System.out.println(student.toString());
    }

}
