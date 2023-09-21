// CalcAverage

package Assessment;

import java.util.Scanner;

/**
 * Q2
 */
public class CalcAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        double avg = (num1+num2+num3)/3;

        System.out.println("The average is: " + avg);

        scanner.close();
    }
}