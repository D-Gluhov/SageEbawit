package Lessons;

public class Methods {
    public static void main(String[] args) {
        Human person1 = new Human();
        Human person2 = new Human("Dima", 18, 103);
        Human person3 = new Human("Grisha", 27);
    }
}

class Human {
    private String name;
    private int age;
    private int weight;

    public Human() {
        System.out.println("Пустой конструктор");
    }
    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("U create a human");
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Vveli constructor s 2 parametrami");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void example() {
        System.out.println(name);
        System.out.println(getName());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}