package Lessons;

public class Builder {
    public static void main(String[] args) {
        StringBuilder bld = new StringBuilder("Hello");
        bld.append(" I am").append(" Dummies").append(" in Java");
        bld.insert(6, "Armen ");
        System.out.println(bld.toString());
    }
}
