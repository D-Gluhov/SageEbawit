package Last;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {

    void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public void subs(int a, int b) {
        int sub = a - b;
        System.out.println(sub);
    }

    public void multi(int a, int b) {
        int sum = a * b;
        System.out.println(sum);
    }

    public void divid(int a, int b) {
        int sum = a / b;
        System.out.println(sum);
    }
}

class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Class c1 = calculator.getClass();
        try (BufferedReader reader = new BufferedReader(new FileReader("TEST.txt"))) {
            String nameMethods = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Method method = null;
            Method[] methods = c1.getDeclaredMethods();
            for (Method myMethod : methods) {
                if (myMethod.getName().equals(nameMethods)) {
                    method = myMethod;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}