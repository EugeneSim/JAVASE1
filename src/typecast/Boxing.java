package typecast;

import java.util.ArrayList;

/**
 * Boxing
 */
public class Boxing {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        nums.remove(Integer.valueOf(10));
        for (Integer x:nums) {
            System.out.println(x);
        }
    }
}