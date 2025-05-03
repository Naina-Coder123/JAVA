import java.util.*;

public class String1 {
    public static void main(String[] args) {
        String str1 = "Hello";// Initialization and declaration
        String str2 = new String("World");// declaration with the new keyword
        // traversal
        String str = "Java";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }
        // another method for traversal
        for (char ch : str.toCharArray()) {
            System.out.println(ch + " ");
        }
        // substring
        System.out.println(str.substring(0, 2));
        System.out.println(str + "Learning");
        System.out.println(str.concat("Lectures"));
        // comaprison
        System.out.println(str.equals("text"));
        System.out.println(str.compareTo("text"));
        /// searching

        System.out.println(str.contains("Learning"));
        System.out.println(str.indexOf("Java"));
        // replace
        System.out.println(str.replace("a", "e"));
        System.out.println(str.replaceAll("Java", "Python"));
        // case conversion

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
