package conditions;

/**
 * IfElse
 */
public class IfElse {

   public static void main(String[] args) {
    int age = 19;
    if (age >= 19) {
        System.out.println("Legal");
    }
    else if (age == 18) {
        System.out.println("Maybe legal");
    }
    else {
        System.out.println("Can not work");
    }
   } 
}