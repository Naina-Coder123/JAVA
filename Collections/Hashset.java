import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(9);
        hash.add(8);
        hash.add(5);
        hash.add(5);
        System.out.println(hash.size());
        System.out.println(hash);
        System.out.println(hash.contains(9));
        System.out.println(hash.remove(0));
        System.out.println(hash.isEmpty());
        for (int i : hash) {
            System.out.println(i);
        }
        hash.forEach(System.out::println);
    }
}
