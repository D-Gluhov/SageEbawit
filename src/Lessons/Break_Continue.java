package Lessons;

public class Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 1) {
                continue;
            }
            System.out.println(i);
        }
    }
}
