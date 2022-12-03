package Tregulov;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(method1("СаламаАллейкум"));
    }

    public static String method1(String str) {
        char[] charAr = str.toCharArray();
        StringBuilder result = new StringBuilder("");
        if (charAr.length > 2) {
            for (int i = 2; i < charAr.length; i++) {
                if (i % 2 != 0) {
                    result.append(str.charAt(i));
                }
            }
        }
        return result.toString();
    }
}
