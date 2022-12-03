package StadeOfProfi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<>();
        Employee emp1 = new Employee("Dima", "IT", 500);
        Employee emp2 = new Employee("Eva", "Bank", 150);
        Employee emp3 = new Employee("Stroutitel", "Urist", 50);

        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);

//        list1.stream().filter(emp -> emp.getDepartment().equals("IT") || emp.getDepartment().equals("Bank"))
//                .filter(emp -> emp.getSalary() > 200).sorted(Comparator.comparing(Employee::getName))
//                .forEach(System.out::println);
        IntStream.rangeClosed(1, 10).mapToObj(Employee::new).peek(employee -> {
            employee.setName("Dima");
            employee.setDepartment("IT");
        }).sorted((sal1, sal2) -> sal2.getSalary() - sal1.getSalary()).forEach(System.out::println);

    }
}

