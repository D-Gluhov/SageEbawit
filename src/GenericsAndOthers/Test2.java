package GenericsAndOthers;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
//        List<String> str1 = new ArrayList<>();
//        str1.add("Privet");
//        str1.add("Hello");
//        str1.add("Salam");
//        showInfo(str1);

        List<Double> dob1 = new ArrayList<>();
        dob1.add(2.22);
        dob1.add(5.66);
        dob1.add(8.55);
        showInfo(dob1);

        ArrayList<Double> v1 = new ArrayList<>();
        v1.add(23.21);
        v1.add(5.66);
        v1.add(8.55);
        System.out.println(sum(v1));
    }


    public static void showInfo(List<? extends Number> list) {
        System.out.println("List sostoit iz " + list);
    }

    public static double sum(ArrayList<? extends Number> al) {
        double db = 0;
        for (Number number : al) {
            db += number.doubleValue();
        }
        return db;
    }
}
