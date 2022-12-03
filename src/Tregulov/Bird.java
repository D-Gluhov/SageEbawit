package Tregulov;

abstract class Bird extends Animal implements Speakable {
    public Bird(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }

    public abstract void fly();
}

class Pingvin extends Bird {
    public Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Pingvin est");
    }

    @Override
    public void sleep() {
        System.out.println("Pingvin spit");
    }

    @Override
    public void fly() {
        System.out.println("Pingvin ne letaet");
    }

    @Override
    public void speak() {
        System.out.println("Pingvin poet");
    }
}