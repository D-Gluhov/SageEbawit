package Last;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionEx {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        Class class1 = Class.forName(scanner.next());
        Class class2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method m1 = class1.getMethod(methodName, class2);
        Object o1 = class1.newInstance();
        Object o2 = class2.getConstructor(String.class).newInstance("Salam");

        m1.invoke(o1, o2);
        System.out.println(o1);
        scanner.close();

    }
}
