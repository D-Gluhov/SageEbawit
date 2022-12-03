package GenericsAndOthers;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("Cat");
        str1.add("Dog");
        str1.add("Cow");

        String print = GenMethod.getSecondElement(str1);
        System.out.println(print);

        ArrayList<Integer> int1 = new ArrayList<>();
        int1.add(21);
        int1.add(232);
        int1.add(2);
        int i = GenMethod.getSecondElement(int1);
        System.out.println(i);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}