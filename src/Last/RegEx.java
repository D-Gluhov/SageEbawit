package Last;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String s1 = """
                AFafewfdfРечная гладь запрудная,
                И в дымке берега,
                Как будто в сказке чудная
                Осенняя шуга*.

                И сл32овно заворожены
                Раздетые леса,
                На землю им21и сброшена
                Увядшая  краса.

                И тишь… И гладь запрудная,
                В тумане бере55га...
                Кака12я осень чудная,
                Задумчиво строга…""";

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()) {
            System.out.println("Start " + matcher.start() + " " + matcher.group());
        }
    }
}
