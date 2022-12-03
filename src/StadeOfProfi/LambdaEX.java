package StadeOfProfi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaEX {
    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<>();
        Employee emp1 = new Employee("Dima", "IT", 500);
        Employee emp2 = new Employee("Eva", "bank", 150);
        Employee emp3 = new Employee("Stroutitel", "Stroutitel", 50);

        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);

        TestEmployee.filtrEmployee(list1, x -> x.department.equals("IT") && x.salary > 200);
        TestEmployee.filtrEmployee(list1, x -> x.name.startsWith("E") && x.salary != 450);
        TestEmployee.filtrEmployee(list1, x -> x.name.equals(x.department));
    }
}

class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee(int salary) {
        this.name = "KRIP";
        this.department = "MESTNIY";
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class TestEmployee {
    static void printEmployee(Employee emp) {
        System.out.println("Imya = " + emp.name + ", department = " + emp.department + ", salary = " + emp.salary);
    }

    static void filtrEmployee(List<Employee> arr, Predicate<Employee> pred) {
        for (Employee emp : arr) {
            if (pred.test(emp)) {
                printEmployee(emp);
            }
        }
    }
}