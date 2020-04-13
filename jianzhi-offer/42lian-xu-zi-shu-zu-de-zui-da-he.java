/*
整型数组，有正负数，子数组为一个或多个连续的整数，秋子数组的和的最大值
使用动态规划：
设动态规划列表 dp ，dp[i] 代表以元素 nums[i] 为结尾的连续子数组最大和
若 dp[i-1]<=0,说明dp[i-1]对nums[i]产生负贡献。
当dp[i-1]>0时，执行dp[i]=dp[i-1]+nums[i];
当dp[i-1]<=0时，执行dp[i]=nums[i];
初始状态：dp[0]=nums[0]


*/
class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i] += Math.max(nums[i-1],0);
            res = Math.max(res,nums[i]);
        }
        return res;
    }
}