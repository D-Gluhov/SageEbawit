package Lessons;

public class StaticTest {
    public static void main(String[] args) {
        Plane.printAmountOfPlanes();
        Plane charter1 = new Plane(5);
        charter1.fly();
        System.out.println(Math.PI);
        long x = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            int g = charter1.height + Plane.amountOfPlanes;
        }
        long y = System.currentTimeMillis();
        System.out.println(y - x);
    }
}

class Plane {
    public int height;
    public static int amountOfPlanes;

    public Plane(int height){
        amountOfPlanes++;
    }
    public void fly(){
        System.out.println("Lessons.Plane is flying");
    }
    public static void printAmountOfPlanes(){
        System.out.println(amountOfPlanes);
    }
}
