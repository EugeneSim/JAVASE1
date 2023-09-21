package exceptions;

/**
 * SimpleExceptions
 */
public class SimpleExceptions {

    public static void main(String[] args) {
        int x=2;
        int y=0;
        String s = null;
        int[] count = {10,20,30};
        try {
        System.out.println(x/y);
        }catch(ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        try {
        System.out.println(s.toUpperCase());
        }catch(NullPointerException ne) {
            s = "Test";
            System.out.println(s.toUpperCase());
        }
        try {
            s="Test";
            System.out.println(s.charAt(5));
        }catch(StringIndexOutOfBoundsException se) {
            System.out.println(s.charAt(s.length() -2));
        }
        
        try {
            System.out.println(count[4]);
        }catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Access to a non existent element is blocked");
        }
        System.out.println("This line is not executed");
    }
}