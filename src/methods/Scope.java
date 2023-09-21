package methods;

/**
 * Scope
 */
public class Scope {

    int res; // instance variable

    public static void main(String[] args) {
        Scope scope = new Scope();
        scope.add(10, 3);
        System.out.println("The result of the addition operation is " + scope.res);
        scope.sub(33, 10);
        System.out.println("The result of the subtraction operation is " + scope.res);
        scope.mul(10, 2); // Changed "multiplication" to "multiplication"
        System.out.println("The result of the multiplication operation is " + scope.res);
        scope.div(10, 2);
        System.out.println("The result of the division operation is " + scope.res);
    }

    void add(int x, int y) {
        res = x + y;
    }

    void sub(int x, int y) {
        res = x - y;
    }

    void mul(int x, int y) { // Changed "int y" from "in y"
        res = x * y;
    }

    void div(int x, int y) {
        res = x / y;
    }
}
