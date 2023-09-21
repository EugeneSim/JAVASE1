package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ScanData
 */
public class ScanData {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int acctNum = 0;
        boolean isValid = false;
        System.out.println("Enter the account number: ");
        while (!isValid) {
        try {
            acctNum = scan.nextInt();
            isValid = true;
        }catch(InputMismatchException ie) {
            System.out.println("Invalid Entry, please enter Account Number: ");
            scan.nextLine();
        }
        System.out.println("Account " + acctNum + " Created");
        
        }
    }
}