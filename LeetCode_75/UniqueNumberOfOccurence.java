package LeetCode_75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurence {

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> mp = new HashMap<>();

        for(int i : arr) {
            if(!mp.containsKey(i)) {
                mp.put(i,1);
            }else {
                mp.put(i,mp.get(i) + 1);
            }
        }


        Set newSet = new HashSet(mp.values());
        if(mp.values().size() != newSet.size())
            return false;
        return true;


    }

    public static void main(String[] args) {
        int arr[] = {1,2};

        System.out.println(uniqueOccurrences(arr));
    }
}
