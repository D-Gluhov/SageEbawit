package Tregulov;

abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Spyat ribi");
    }

    public abstract void swim();
}

class Mechenosec extends Fish {
    public Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Mechenosec Est obicniu korm");
    }
    @Override
    public void swim() {
        System.out.println("Mechenosec Bistro plavaet");
    }
}