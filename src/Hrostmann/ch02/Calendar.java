package Hrostmann.ch02;

import java.time.LocalDate;
import static java.lang.System.out;

public class Calendar {
    private LocalDate date;

    private Calendar(int month) {
        this.date=LocalDate.of(LocalDate.now().getYear(), month, 1);
    }

    public static Calendar of (int month) {
        return new Calendar(month);
    }

    public static Calendar of () {
        return of(LocalDate.now().getMonth().getValue());
    }

    public Integer swap(Integer a, Integer b) {
        return a;
    }

    public void showIt () {
        int monthNum = date.getMonthValue();
        indentation(date.getDayOfWeek().getValue());
        while(date.getMonthValue()==monthNum) {
            out.printf("%4d", date.getDayOfMonth());
            if(date.getDayOfWeek().getValue()==6)
                out.println();
            date = date.plusDays(1);
        }
    }

    public static void indentation (int day)
    {
        out.printf("%4s%4s%4s%4s%4s%4s%4s\n","Sun","Mon","Tue","Wed","Thu","Fri","Sat");
        for(int i = 0; i<day; i++)
            out.printf("%4s","");
    }
}
