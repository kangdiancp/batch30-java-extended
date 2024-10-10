package day02;

import java.util.Arrays;

public class IntroArray {
    public static void main(String[] args) {
        //initial
        int[] nums = new int[]{12,12,3,4,5};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

        System.out.println();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
