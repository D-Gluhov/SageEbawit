package Lessons36_50;

public class ExceptionTest1 {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        try {
            tiger1.eat("myaso");
            tiger1.drink("voda");
            try {
                tiger1.drink("pivo");
            } catch (neVodaException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (
                RuntimeException a) {
            System.out.println(a.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class neMyasoException extends RuntimeException {
    public neMyasoException(String message) {
        super(message);
    }
}

class neVodaException extends Exception {
    public neVodaException(String message) {
        super(message);
    }
}

class Tiger {
    public void eat(String food) {
        if (food.equals("myaso")) {
            System.out.println("Tiger is eating....");
        } else throw new neMyasoException("Tiger ne est " + food);
    }

    public void drink(String water) throws neVodaException {
        if (water.equals("voda")) {
            System.out.println("Tiger is drinking....");
        } else throw new neVodaException("Tiger ne pyet " + water);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tiger other = (Tiger) obj;
        return true; // Пишем поля для сравнения
    }
}