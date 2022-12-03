package Lessons36_50;

interface Moving {
    public void move();
}

public class AnonClass {
    public static void main(String[] args) {
        Moving m1 = new Moving() {
            @Override
            public void move() {
                System.out.println("Other is moving...");
            }
        };
        m1.move();
    }
}
