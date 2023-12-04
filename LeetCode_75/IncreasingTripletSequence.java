package LeetCode_75;

import java.util.Scanner;

public class IncreasingTripletSequence {

    public static boolean increasingTriplet(int[] nums) {
        int n = nums.length;

        //TLE
        // for(int i=0;i<n-1;i++) {
        //     for(int j = i+1;j<n;j++) {
        //         if(nums[i] < nums[j]) {
        //         for(int k = j+1;k<n;k++) {
        //             if(nums[j] < nums[k]) {
        //                 return true;
        //             }
        //         }
        //     }
        //     }
        // }

        int small = Integer.MAX_VALUE , big = Integer.MAX_VALUE;

        for(int i : nums) {
            if(i <= small) {
                small  = n;
            }
            else if(i <= big) {
                big = n;
            }
            else return true;
        }
        

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(increasingTriplet(nums));
    }
}
