package Lessons;

public class StaticModifier {
    public static void main(String[] args) {
        Car car1 = new Car("Bmw", 5);
        car1.infoCars();
    }

}

class Car {
    private String model;
    private int number;

    public static int wheals = 4;
    public static int numberOfCars;

    public Car(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public void infoCars() {
        System.out.println(model + "," + number + " have a " + wheals + " wheals");
    }
}