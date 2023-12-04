package LeetCode_75;

public class MaximumAverageSubarray {

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double ans = 0;
        for(int i=0;i<k;i++) {
            ans += nums[i];
        }

        double avg = ans /k;
        double maxSum = Integer.MIN_VALUE;
        maxSum = Math.max(maxSum,avg);
        int i=0;
        int j = k;
//        System.out.println(ans);
        while(j<n) {
            ans += nums[j];
            ans -= nums[i];
            avg = ans /k;
            maxSum = Math.max(maxSum,avg);
//            System.out.println(ans);
            i++;
            j++;
        }

        return  maxSum;


    }

    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3}; //(12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

        int k = 4;

        System.out.println(findMaxAverage(nums,k));
    }
}
