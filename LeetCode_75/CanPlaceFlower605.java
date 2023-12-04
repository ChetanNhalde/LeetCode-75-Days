package LeetCode_75;

public class CanPlaceFlower605 {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        
         //  boolean flag = false;

        // // if(flowerbed[0] == 0) {
        // //     flag = true;
        // //     for(int i=1;i<flowerbed.length;i+=2) {

        // //     }
        // // }
        // // int lastOne = -1;
        // // for(int i=0;i<flowerbed.length - 2 && n>0;i++) {
        // //     if(flowerbed[i] == 1 && flowerbed[i+2] != 1) {
        // //        flag = true;
        // //        flowerbed[i+2] = 1;
        // //        n--;
        // //        i++;
               
        // //     }
        // //     else flag = false;
        // // }

       

        // if(flowerbed[0] == 0 && flowerbed[2]  == 1) 
        // {
        //     flowerbed[0] = 1;
        //     n--;
        // }

        // if(flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-3] == 1 ) {
        //     flowerbed[0] = 1;
        //     n--;
        // }
         
        // for(int i=1;i<flowerbed.length-1;i++) {
        //     if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0 && n>0){
        //         flowerbed[i] = 1;
        //         // flag = true;
        //         n--;
        //     }

        // }
        // if(n>0)
        // return false;
        // else return true;

        int count = 0;
        for(int i=0;i<flowerbed.length && count < n ;i++) {
            if(flowerbed[i] == 0) {
                int next = (i==flowerbed.length-1) ? 0 : flowerbed[i+1];
                int prev = (i == 0)? 0:flowerbed[i-1];
                if(next == 0 && prev == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        
        return count == n;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(arr,n));
    }
}
