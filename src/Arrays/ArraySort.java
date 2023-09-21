package Arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int nums[] = {3,1,3,95,2,4};
        int min = 0;
        int temp = 0;
        int minnum[] = new int[nums.length];
        // for (int i = 0; i < nums.length; i++){
        //     for (int j = i+1; j<nums.length; j++){
        //         if (nums[i]>nums[j])
        //             {temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;}
                
        //     }
        // }
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i]>nums[i+1])
                {temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
                i = -1;
                }

        }
        // Arrays.sort(nums); // build-in method
        System.out.println(Arrays.toString(nums)); // print out an array
    }
}