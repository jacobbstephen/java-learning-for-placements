/*
 * Given n on negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining
 * 
 */

public class TrappedWater {
    public static void main(String[] args) {
        // height of bar
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        //find the left boundary
        int ht = height.length;
        int leftMax[] = new int[ht];
        leftMax[0] = height[0];
        for(int i = 1; i < ht; i++)
            leftMax[i] =  Math.max(height[i],leftMax[i - 1]);
        //  find the right Max boundary
        int rightMax[] =  new int[ht];
        rightMax[ht-1] =  height[ht - 1];
        for(int i = ht - 2; i >= 0; i--)
            rightMax[i] =  Math.max(height[i],rightMax[i + 1]);
        // calculate the trapped water
        int trappedWater = 0;
        for(int i = 0; i < ht; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trappedWater += (waterLevel - height[i]) * width;
            // here width = 1 so  it is not multiplied
            trappedWater += waterLevel - height[i];
        }
        System.out.println(trappedWater);
    }
}
