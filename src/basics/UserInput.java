package basics;

import java.util.Scanner;

/**
 * UserInput
 */
public class UserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name;");       
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your city: ");
        input.nextLine();
        String loc = input.nextLine();
        System.out.println("Welcome" + name + "you are" + age + "years old" + "live in" + loc);
    }
}