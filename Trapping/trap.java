import java.util.*;
class trap {
    public static void main(String[] args) {
        int ht [] = new int[]{3, 0,1, 0, 4, 0, 2};
        int leftMax[] = new int[7];
        int rightMax[] = new int[7];
        leftMax[0] = ht[0];
        rightMax[ht.length - 1] = ht[ht.length - 1];
        for(int i = 1; i < ht.length; i++)
            leftMax[i] = Math.max(ht[i], leftMax[i - 1]);
        for(int i = ht.length - 2; i >= 0; i--)
            rightMax[i] = Math.max(ht[i], rightMax[i  + 1]);
        int trappedWater = 0;
        for(int i = 0; i < ht.length; i++){
            trappedWater += Math.min(leftMax[i], rightMax[i]) - ht[i];
        }
        System.out.println(trappedWater);
        
    }
}
