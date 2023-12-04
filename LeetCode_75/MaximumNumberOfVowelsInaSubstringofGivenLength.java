package LeetCode_75;

public class MaximumNumberOfVowelsInaSubstringofGivenLength {

    public static int maxVowels(String s, int k) {

//        int i = 0;
//        int j = k-1;
//        int count = 0;
//        int maxCount = Integer.MIN_VALUE;
//        while(j < s.length() || i < s.length()) {
//            while(i<j) {
//                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
//                        || s.charAt(i) == 'u') {
//                    count++;
////                    System.out.println(count);
////                    System.out.println(s.charAt(i));
//
//                }
////                System.out.println(i);
////                System.out.println(s.charAt(i));
//
//                ++i;
//            }
////            System.out.println(i);
////            System.out.println(j);
//
//            maxCount = Math.max(maxCount,count);
//            i = j;
//            j = i+k>s.length()?s.length():i+k;
////            System.out.println(j);
//            count = 0;
//
//        }

        int vowel = 0;
        int maxCount = 0;
        for(int i=0;i<k;i++) {
            if(isVowel(s.charAt(i))) vowel++;
        }
        maxCount = vowel;
        for(int i=k;i<s.length();i++) {
            if(isVowel(s.charAt(i))) vowel++;
            if(isVowel(s.charAt(i-k))) vowel--;

            maxCount = Math.max(maxCount,vowel);

        }

        return maxCount;
    }
    private static boolean isVowel(char c){
        if((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "weallloveyou";
        int k = 7;

        System.out.println(maxVowels(s,k));
    }
}
