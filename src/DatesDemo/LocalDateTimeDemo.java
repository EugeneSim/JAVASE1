package DatesDemo;

import java.time.LocalDateTime;

/**
 * LocalDateTimeDemo
 */
public class LocalDateTimeDemo {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTimeCustom = LocalDateTime.of(20, 7, 10, 11, 33, 29);
        System.out.println(localDateTimeCustom);
    }
}