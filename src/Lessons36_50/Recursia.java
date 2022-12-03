package Lessons36_50;

public class Recursia {
    public static void main(String[] args) {
        System.out.println(fac(7));
        System.out.println(fibonacci(5));
    }

    /* fac(7)
        7 * fac(6)
        6 * fac(5)
     */
    public static int fac(int n) {
        if (n == 1)
            return 1;

        return n * fac(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
