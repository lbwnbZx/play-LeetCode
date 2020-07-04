/*
//关注当前列，左边最高的墙和右边最高的墙
class Solution {
    public int trap(int[] height) {
        int sum = 0;
        //边不需要考虑
        for(int i=1;i<height.length-1;i++){
            int left = 0;
            //找出左边最高 
            for(int j=i-1;j>=0;j--){
                if(height[j]>left) left = height[j];
            }
            
            //找出右边最高
            int right=0;
            for(int j=i+1;j<height.length;j++){
                if(height[j]>right) right = height[j];
            }
            
            //两端较小的
            int min = Math.min(left,right);
            //只有较小的一端比当前列高才会有水，较小的一端比当前列低的话当前列不会有水
            if(min>height[i]) sum+=min-height[i];
            
        }
        return sum;
    }
}
*/

//动态规划
class Solution {
    public int trap(int[] height) {
        int sum = 0;
        //用来存储第i列左边最高的墙和右边最高的墙
        int []max_left = new int[height.length];
        int []max_right = new int[height.length];
        
        //前边的墙的左边的最高高度和它前边的墙的高度选一个较大的就是当前列左边最高的墙
        for (int i = 1; i < height.length - 1; i++) {
            max_left[i] = Math.max(max_left[i - 1], height[i - 1]);
        }
        //后边的墙的右边的最高高度和它后边的墙的高度选一个较大的就是当前列右边最高的墙
        for (int i = height.length - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
        }
        
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(max_left[i], max_right[i]);
            if (min > height[i]) {
                sum = sum + (min - height[i]);
            }
        }
        return sum;
    }
}
