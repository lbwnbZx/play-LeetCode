class Solution:
    def search(self, nums: List[int], target: int) -> int:
        
        def helper(target):
            i, j = 0, len(nums)-1
            while i<=j:
                m = (i+j)//2
                if nums[m] <= target :i = m +1
                else: j = m - 1
            return i

        return helper(target) - helper(target-1)    
