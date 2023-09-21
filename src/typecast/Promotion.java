package typecast;

/**
 * Promotion
 */
public class Promotion {

    public static void main(String[] args) {
        // one of the variables should be of the large type to get desired result
        int i = 55555;
        // the result is not accurate as the same exceeds the max value of the int type BELOW
        int j = 66666;
        long l = i*j;
        System.out.println(l);
    }
}