package inheritance;

public class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is eating...");
    }
}