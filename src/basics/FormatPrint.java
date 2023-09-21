package basics;

/**
 * FormatPrint
 */
public class FormatPrint {

    public static void main(String[] args) {

        System.out.println("Sno        Name       Salary      Location");
        System.out.println("%-5s | %-15s | %010.2f | %-10s%n");
        System.out.println("10         Alex       3000        Singapore");
        String s1 = "Hello";
        String s2 = "World";
        System.out.printf("%s | %s", s1, s2);

        float sal = 1000.20f;
        System.out.printf("%010.3f", sal);

        String reset = "\u001B[0m"; // Reset color
        String red = "\u001B[31m"; // Red
        String green = "\u001B[32m"; // Green
        String yellow = "\u001B[33m"; // Yellow
        String blue = "\u001B[34m"; // Blue
        String purple = "\u001B[35m"; // Purple
        String cyan = "\u001B[36m"; // Cyan
        String white = "\u001B[37m"; // White

        System.out.printf("%s %-5s | %-15s | %-10s | %-15s %s%n", red, "Sno", "Name", "Salary", "Location", reset);
        System.out.println("---------------------------------------------------");
        System.out.printf("%s %-5d | %-15s | %010.2f | %-15s %s%n", yellow, 10, "Alex", 1000.2, "SG", reset);
        System.out.printf("%s %-5d | %-15s | %010.2f | %-15s %s%n", yellow, 20, "Alex", 1000.2, "SG", reset);
        System.out.printf("%s %-5d | %-15s | %010.2f | %-15s %s%n", yellow, 10, "Jim", 1000.2, "SG", reset);
        System.out.printf("%s %-5d | %-15s | %010.2f | %-15s %s%n", yellow, 30, "Jack", 100.2, "SG", reset);
        System.out.printf("%s %-5d | %-15s | %010.2f | %-15s %s%n", yellow, 10, "Alex", 1600.2, "SG", reset);
        System.out.printf("%s %-5d | %-15s | %010.2f | %-15s %s%n", yellow, 10, "Alex", 1000.2, "SG", reset);
    }
}