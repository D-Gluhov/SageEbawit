package GenericsAndOthers;

public class ParameterizedClass1 {
    public static void main(String[] args) {
        Car<String> car1 = new Car<>("BMW");
        System.out.println(car1);
        String chirk = car1.getValue();
        System.out.println(chirk);

        Car<Integer> car2 = new Car<>(5);
        System.out.println(car2);
        Integer number = car2.getValue();
        System.out.println(number);
    }


}

class Car<T> {
    private T value;

    public Car(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "The best car is " + value;
    }
}