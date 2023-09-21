package conditions;
import java.util.Scanner;
/**
 * TurnaryOperator
 */
public class TurnaryOperator {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        String res = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + res);
        scan.close();
    }
}