package LeetCode_75;

import java.util.Arrays;

public class CountingBits {
    public static int[] countBits(int n) {
        int count[] = new int[n+1];

        if(n == 0) {
            count[0] = 0;
            return count;
        }

        for(int i=0;i<=n;i++) {
            count[i] = countSetBits(i);
        }



        return count;


    }

    public static int countSetBits(int n) {
        if(n == 0) {
            return 0;
        }

        return 1 + countSetBits(n & (n - 1));
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }
}
