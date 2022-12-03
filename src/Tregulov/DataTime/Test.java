package Tregulov.DataTime;

import java.time.*;
import java.time.format.*;


public class Test {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2022, Month.OCTOBER, 1, 9, 00);
        LocalDateTime ldt2 = LocalDateTime.of(2022, Month.OCTOBER, 31, 23, 59);
        Period p1 = Period.ofDays(1);
        Duration d1 = Duration.ofHours(24);

        Rabota r1 = new Rabota();
        r1.smena(ldt1, ldt2, p1, d1);
//        System.out.println(LocalDateTime.now());
    }

}

class Rabota {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

    public void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p1, Duration d1) {
        while (ldt1.isBefore(ldt2)) {
            System.out.print("Работаем с: " + ldt1.format(f1));
            ldt1 = ldt1.plus(p1);
            System.out.println(" До: " + ldt1.format(f1));

            System.out.print("Отдыхаем с: " + ldt1.format(f2));
            ldt1 = ldt1.plus(d1);
            System.out.println(" До: " + ldt1.format(f2));
        }
    }
}
