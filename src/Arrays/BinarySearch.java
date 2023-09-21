package Arrays;

import java.util.Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        int x[] = {1,2,3,4,5};
        Arrays.sort(x);
        int res = Arrays.binarySearch(x,1);
        if (res >= 0) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }
}