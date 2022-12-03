package Last;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Ref1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException,
            IllegalAccessException, NoSuchFieldException {
        Class classEmp = Class.forName("Last.Person");

        Person petya = (Person) classEmp.getConstructor(String.class, int.class).newInstance("Petya", 28);
        Field fieldSalary = classEmp.getDeclaredField("salary");
        fieldSalary.setAccessible(true);
        double salary = (double) fieldSalary.get(petya);
        System.out.println(salary);


        System.out.println(petya);
    }
}
