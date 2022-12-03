package Last;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        listNum.add(2);
        listNum.add(7);
        listNum.add(15);
        listNum.add(26);
        listNum.add(85);
        listNum.add(172);
        listNum.add(27);
        listNum.add(31);

//        listNum.stream().filter(num -> num % 2 != 0 && num % 5 == 0)
//                .mapToInt(Integer::intValue).average().ifPresent(System.out::println);

        List<String> listString = new ArrayList<>();
        listString.add("sdfsdf");
        listString.add("ewfvc");
        listString.add("sd");
        listString.add("sdsdsfsdffsdf");
        listString.add("fdf");
        listString.add("s");

//        listString.stream().filter(str -> str.length() > 8).distinct().forEach(System.out::println);
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("SEMZNAXHE", 5);
        map1.put("SEdsdfsd", 10);
        map1.put("SE323", 15);
        map1.put("S234AX", 11);

//        map1.entrySet().stream().filter(entry -> entry.getKey().length() > 7).reduce((acc, i1) -> acc.getValue()).get();
//        List<Integer> integerList2 = List.of(5, 4, 3, 2, 1, 0);
//        integerList2.stream().map(Object::toString)
//                .reduce((str, str2) -> str + str2)
//                .ifPresent(System.out::println);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 5);
//
//        Integer sum = numbers.stream()
//                .reduce(10, (a, b) -> a * b);
//
//        System.out.println(sum);

        List<Integer> numbers = Arrays.asList(5, 2, 3);

        // 1*10 + 2*10 + 3*10
        Integer sum = numbers.stream()
                .reduce(10, (identity, val) -> val, (left, right) -> left + right);

        Integer a = Stream.of("duck", "chicken", "flamingo", "pelican")
                .reduce(0,
                        (c1, c2) -> c1 + c2.length(),
                        (s1, s2) -> s1 + s2);
        System.out.println(a);

//        System.out.println(sum);

        List<Integer> l1 = new ArrayList<>();
        l1.remove(1);
    }
}
