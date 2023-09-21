package DatesDemo;

import java.time.LocalDate;
/**
 * LocalDateDemo
 */
public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());

        //custom date
        LocalDate localDateCustom = LocalDate.of(2020, 4, 25);
    }
    
}