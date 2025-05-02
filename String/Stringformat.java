import java.util.*;

public class Stringformat {
    public static void main(String[] args) {
        String name = "Shivam";
        int marks = 100;
        // System.out.println("Hello" + name + "your marks are" + marks);
        // using printf format specifier to reduce the code
        // %s is used for string and %d is used for integer
        // %n is used for new line
        // %f is used for float and double
        // %c is used for char
        // %b is used for boolean
        // %x is used for hexadecimal
        // %o is used for octal
        // %e is used for scientific notation
        // %g is used for general format

        System.out.printf("Hello %s your marks are %d%n", name, marks);
        // to convert the name in caps we will use %S
        System.out.printf("Hello %S your marks are %d%n", name, marks);
    }

}
