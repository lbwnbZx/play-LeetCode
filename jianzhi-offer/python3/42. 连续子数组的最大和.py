class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # 设一个动态规划列表dp[],dp[i]=dp[i-1]+nums[i]
        for i in range(1,len(nums)):
            nums[i] += max(nums[i-1],0)
        return max(nums)
