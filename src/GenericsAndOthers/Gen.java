package GenericsAndOthers;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Gen {
    public static void main(String[] args) {
        ////////// Java 5 //////
        List animal = new ArrayList();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Horse");

        String animal2 = (String) animal.get(1);
        System.out.println(animal2);

        ////////// with add Generics //////

        List<String> animal3 = new ArrayList<String>();
        animal3.add("Dolphin");
        animal3.add("Fish");
        String animal4 = animal3.get(0);

        //////// JAVA 7 /////

        List<String> animal5 = new ArrayList<>();
    }
}
