package loops;

/**
 * NestedFor
 */
public class NestedFor {

    public static void main(String[] args) {
        
        for (int i=0; i <11; i++)
            for (int j=0; j<5; j++) {
                System.out.println(j + " x " + i  + " = " + (i*j));
            }
    }
}