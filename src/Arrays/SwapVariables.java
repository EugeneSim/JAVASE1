package Arrays;

/**
 * SwapVariables
 */
public class SwapVariables {

    public static void main(String[] args) {
        int x = 10;
        int y = 89;

        int temp = x;
        x = y;
        y = temp;
        
        System.out.println(y);
        System.out.println(x);

        int a = 10;
        int b = 5;
        a = a+b;
        b = a-b;
        a= a-b;
        System.out.println(a);
        System.out.println(b);
    }
}