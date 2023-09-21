package exceptions.assertions;

/**
 * AssertDemo
 */
public class AssertDemo {

    public static void main(String[] args) {
        int age = 18;
        //logic 
        assert age >= 18: "Age must be greater than 18";
        System.out.println("Eligible to vote");
    }
}