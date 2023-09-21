package loops;

/**
 * LoopsWithArray
 */
public class LoopsWithArray {

    public static void main(String[] args) {
        int x[] = { 1,2,3,4,5,6,7,8,9 };
        //access using loops
        for ( int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }

        System.out.println();
        //enhance for loops
        for (int a : x) {
            System.out.println(a);
        }

    }
}