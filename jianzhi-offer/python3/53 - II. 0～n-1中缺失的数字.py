# 排序数组中的搜索问题，首先想到的是二分法
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        l, r = 0, len(nums)-1
        while l <= r:
            m = (l + r)// 2
            if m == nums[m]: l = m + 1
            else: r = m - 1
        return l
