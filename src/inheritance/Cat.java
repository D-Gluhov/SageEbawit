package inheritance;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving...");
    }
}
