package StadeOfProfi;
import java.util.*;

public class HashMapa {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Object i = map.put(3,"Dima");
        map.put(4,"Petya");
        map.put(8,"Misha");

        Object b = map.put(3,"Grisha");

        System.out.println(i);
        System.out.println(b);

//        map.merge(9, "Sergey Volosatov", (oldVal, newVal) -> oldVal + newVal);
//        map.merge(9, " Fedulov", (oldVal, newVal) -> oldVal + newVal);
//
//        map.computeIfPresent(5, (key, value) -> key + value);
//        map.computeIfAbsent(10, key -> key + "ZIR");
//
//        for(Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }


//        System.out.println(map.get(4));
//        System.out.println(map.get(3));
//        System.out.println(map.get(8));

    }
}
