package GenericsAndOthers;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(23));
        animals.add(new Animal(77));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        print(animals);
        print(dogs);
    }
    public static void print(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);;
        }
    }
}
