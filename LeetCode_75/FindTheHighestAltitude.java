package LeetCode_75;

public class FindTheHighestAltitude {

    public static int largestAltitude(int[] gain) {

        int n = gain.length;
        int start = 0;
        int prefixSum[] = new int[n+1];
        prefixSum[0] = start;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            prefixSum[i+1] = prefixSum[i] + gain[i];
            System.out.println(prefixSum[i]);
            ans = Math.max(ans,prefixSum[i+1]);
        }


        return Math.max(ans, 0);


    }

    public static void main(String[] args) {
        int gain[] = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81}; // The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

        System.out.println(largestAltitude(gain));
    }
}
