class Solution:
    def findRepeatNumber(self, nums: List[int]) -> int:
        i = 0
        while i < len(nums):
            if nums[i] == i:
                i+=1
                continue
            if nums[nums[i]] == nums[i]: 
                return nums[i]
            # nums[nums[i]],nums[i] = nums[i],nums[nums[i]]
            temp = nums[nums[i]]
            nums[nums[i]] = nums[i]
            nums[i] = temp
        return -1    
