package StadeOfProfi;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class LambdaEx2 {
    public static void main(String[] args) {
        // 3
        Predicate<Integer> pred = x -> x % 13 == 0;
        // 4
        BinaryOperator<String> by = (x, y) -> {
            if (x.length() > y.length()) {
                return x;
            }
            return y;
        };
        // 3


    }
}
