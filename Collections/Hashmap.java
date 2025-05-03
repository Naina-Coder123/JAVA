import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Naina");
        map.put(2, "Sam");
        map.put(3, "Hammer");
        System.out.println(map);

        map.remove(2);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.remove(3));
        for (int key : map.keySet()) {
            System.out.println(key);

        }
        for (String value : map.values()) {
            System.out.println(value);
        }

    }
}
