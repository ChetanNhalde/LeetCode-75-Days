package LeetCode_75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindthDifferenceOfTwoArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        Map<Integer,Integer> n1 = new HashMap<>(n);
        Map<Integer,Integer> n2 = new HashMap<>(m);

        for(int i : nums1) {
            if(n1.containsKey(i)) {
                n1.put(i,n1.get(i) + 1);
            }
            else {
                n1.put(i,1);
            }
        }

        for(int i : nums2) {
            if(n2.containsKey(i)) {
                n2.put(i,n2.get(i) + 1);
            }
            else {
                n2.put(i,1);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        for(int i : nums1) {

            if(!n2.containsKey(i) && !ans1.contains(i)) {
                ans1.add(i);
            }
        }

        for(int i : nums2) {
            if(!n1.containsKey(i) && !ans2.contains(i)) {
                ans2.add(i);
            }
        }

        ans.add(ans1);
        ans.add(ans2);

        return ans;
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,3};
        int nums2[] = {1,1,2,2};

        System.out.println(findDifference(nums1,nums2));

    }
}
