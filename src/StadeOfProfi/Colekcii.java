package StadeOfProfi;

import java.util.*;

public class Colekcii {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();
        vremyaVipolneniya(array);
        vremyaVipolneniya(linked);

        
    }


    public static void vremyaVipolneniya(List<Integer> l1) {
        for (int i = 0; i < 100_0000; i++) {
            l1.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            l1.remove(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
