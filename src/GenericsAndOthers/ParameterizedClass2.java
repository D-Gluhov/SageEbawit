package GenericsAndOthers;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Wood<String, Integer> wood1 = new Wood<>("Tree", 23);
        Wood<Integer, Double> wood2 = new Wood<>(21, 22.2);
        System.out.println("First wood is " + wood1.getFirstValue() + " age is " + wood1.getSecondValue2());
        System.out.println("First wood is " + wood2.getFirstValue() + " age is " + wood2.getSecondValue2());
        Crypto<Integer> crypto1 = new Crypto<>(20, 20000000);
        System.out.println("Crypto price is " + crypto1.getPrice() + " crypto supply is " + crypto1.getSupply());
    }
}

class Wood<V1, V2> {
    private V1 value;
    private V2 value2;

    public Wood(V1 value, V2 value2) {
        this.value = value;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value;
    }

    public V2 getSecondValue2() {
        return value2;
    }
}

class Crypto<V> {
    private V price;
    private V supply;

    public Crypto(V price, V supply) {
        this.price = price;
        this.supply = supply;
    }

    public V getPrice() {
        return price;
    }

    public V getSupply() {
        return supply;
    }
}