package Serialiazed;

import java.io.Serial;
import java.io.Serializable;

public class Animal implements Serializable {
    @Serial
    private static final long serialVersionUID = -4121448703444888744L;
    String name;
    int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + ": weight " + weight;
    }
}
