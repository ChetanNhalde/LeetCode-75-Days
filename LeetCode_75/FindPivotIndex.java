package LeetCode_75;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int prefixSum[] = new int[n];
        prefixSum[0] = nums[0];
        for(int i=1;i<n;i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
//            System.out.println(prefixSum[i]);
        }

        if(0 == prefixSum[n-1] - prefixSum[0]) {
//            System.out.println( );
            return 0;
        }


        for(int i=1;i<n;i++) {
            if(prefixSum[i-1] == (prefixSum[n-1] - prefixSum[i])) {

                return i;
            }
        }



        if(0 == prefixSum[n-2]) {
//            System.out.println(prefixSum[n-2]);
            return n-1;
        }

        return -1;




    }

    public static void main(String[] args) {
        int nums[] = {-1,-1,0,1,1,-1};/*
                                        The pivot index is 3.
                                        Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
                                        Right sum = nums[4] + nums[5] = 5 + 6 = 11
                                    */
        System.out.println(pivotIndex(nums));
    }
}
