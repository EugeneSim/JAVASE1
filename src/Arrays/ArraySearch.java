package Arrays;

import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number to search: ");
        int query = scan.nextInt();
        
        boolean isFound = false;
        for (int i : nums) {
            if (i == query) {
                isFound = true;
                break;
            }
        }
        
        if (isFound)
            System.out.println(query + " is found");
        else
            System.out.println(query + " not found");
        
        // Close the scanner
        scan.close();
    }
}
