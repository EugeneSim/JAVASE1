package basics;

import java.util.Scanner;

public class RevString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scan.nextLine();
        System.out.println("The reverse of " + s + " is " + reverse(s));
        System.out.println((isPalindrome(s) ? "Is a Palindrome" : "Not a Palindrome"));
        System.out.println();
        scan.close();
    }

    static String reverse(String string) {
        String rev = " ";
        for (int i = string.length() - 1; i >= 0; i--) {
            rev += string.charAt(i);
        }
        return rev.trim();
    }

    static boolean isPalindrome(String s) {
        if (s.equalsIgnoreCase(reverse(s))) {
            return true;
        } else
            return false;
    }
}
