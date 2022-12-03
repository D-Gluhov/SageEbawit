package StadeOfProfi;

public class Test {
    public static void main(String[] args) {
//        System.out.println(everyNth("Miracle", 2));
        String a = "Miracle";
        System.out.println(a.length());
    }

    public static String everyNth(String str, int n) {
        String result = str.substring(0, 1);
        while (n < str.length()) {
            result = result + str.charAt(n);
            n += n;
        }
        return result;
    }
}
