package DatesDemo;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {
    public static void main(String[] args) {
        // Current time
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.print(localTime.getHour() + ":");
        System.out.print(localTime.getMinute() + ":");
        System.out.print(localTime.getSecond());
        // formatted time
        System.out.println(localTime.format(DateTimeFormatter.ofPattern("hh:mm a")));

        // Custom Time
        LocalTime localTimeCustom = LocalTime.of(10, 15);
        System.out.println(localTimeCustom);
        System.out.print(localTimeCustom.getHour() + ":");
        System.out.print(localTimeCustom.getMinute() + ":");
        System.out.print(localTimeCustom.getSecond());

        // display time in other time zone
        LocalTime localTimeZone = LocalTime.now(ZoneId.of("Asia/Singapore"));
        // LocalTime localTimeZone = LocalTime.now(ZoneId.of("asia/kolkata"));
        System.out.println(localTimeZone);
    }

}