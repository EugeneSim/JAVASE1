package Assessment;

import java.util.Scanner;

/**
 * StringManipulation
 */
public class StringManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = scanner.nextLine();

        //toUppercase
        System.out.println(input.toUpperCase());
        //toLowercase
        System.out.println(input.toLowerCase());
        //calc display length of string
        System.out.println(input.length());
        //first char
        System.out.println(input.charAt(0));
        //last char
        System.out.println(input.charAt(input.length()-1));
        //reverse using string builder
        StringBuilder reverseBuilder = new StringBuilder(input);
        String reverse = reverseBuilder.reverse().toString();
        System.out.println(reverse);


    }
}