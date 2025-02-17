//Q. ->     Given n non-negative integers representing an elevation map where the width
//          of each bar is 1, compute how much water it can trap after raining.

package array;

public class trappedRainWater {

    public static int trappedRainWater(int height[]) {
        int width = 1, trapped_water = 0;

        // calculate left max boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate right max boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop

        for (int i = 0; i < height.length; i++) {
            int water_level = Math.min(leftMax[i], rightMax[i]);// water level=min(lef_Max,right_Max)
            trapped_water += (water_level - height[i]) * width; // trapped water =(water_level - bar_level)*width
        }

        return trapped_water;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println("Traped water : " + trappedRainWater(height));
    }
}
