package basics;

/**
 * Colors
 */
public class Colors {

    public static void main(String[] args) {
        String reset = "\u001B[0m"; // Reset color
String red = "\u001B[31m";   // Red
String green = "\u001B[32m"; // Green
String yellow = "\u001B[33m"; // Yellow
String blue = "\u001B[34m";   // Blue
String purple = "\u001B[35m"; // Purple
String cyan = "\u001B[36m";   // Cyan
String white = "\u001B[37m";  // White

    // Print colored text
    System.out.println(red + "This is red text." + reset);
    System.out.println(green + "This is green text." + reset);
    System.out.println(yellow + "This is yellow text." + reset);
    System.out.println(blue + "This is blue text." + reset);
    System.out.println(purple + "This is purple text." + reset);
    System.out.println(cyan + "This is cyan text." + reset);
    System.out.println(white + "This is white text." + reset);
    }
}