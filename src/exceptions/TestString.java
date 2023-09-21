package exceptions;

import java.util.Scanner;

/**
 * TestString
 */
public class TestString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        int temp = 0;
        boolean isValid = false;

        while(!isValid) {
            System.out.println("Enter your name: ");
            name = scan.nextLine();
            for (int i=0; i<=name.length() - 1 ; i++) {
                if(!(name.charAt(i) >= 97 && name.charAt(i) <= 127 || name.charAt(i) >= 65 && name.charAt(i) <= 90)) {
                    temp ++;
                }
                if(temp==0) {
                    isValid = true;
                }
            }
       

        }
      System.out.println("Welcome " + name);
    } 
}