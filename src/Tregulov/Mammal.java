package Tregulov;

abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    public abstract void run();
}

class Lev extends Mammal {
    public Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Lev est");
    }

    @Override
    public void sleep() {
        System.out.println("Lev spit");
    }
    @Override
    public void run() {
        System.out.println("Lev bezit");
    }

}