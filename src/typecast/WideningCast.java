package typecast;

/**
 * WideningCast
 */
public class WideningCast {

    public static void main(String[] args) {
        byteWideCast();
        shortWideCast();
        intWideCast();
        longWideCast();
        floatWideCast();
    }
    
    static void byteWideCast() {
            byte b = 2;
            short s = b;
            int i = b;
            long l = b;
            float f = b;
            double d = b;
            System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " ");
            
        }

    static void shortWideCast() {
            short s = 2;
            int i = s;
            long l = s;
            float f = s;
            double d = s;
            System.out.println(s + " " + s + " " + i + " " + l + " " + f + " " + d + " ");
            
        }

    static void intWideCast() {
            int i = 2;
            long l = i;
            float f = i;
            double d = i;
            System.out.println(i + " " + i + " " + i + " " + l + " " + f + " " + d + " ");
            
        }


    static void longWideCast() {

            long l = 2;
            float f = l;
            double d = l;
            System.out.println( l + " " + f + " " + d + " ");
            
        }

    static void floatWideCast() {

            float f = 2;
            double d = f;
            System.out.println( f + " " + d + " ");
            
        }
}