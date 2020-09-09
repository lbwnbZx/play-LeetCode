# 切片法
#class Solution:
#    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
#        if len(nums) == 0: return []
#        res = []
#        for i in range(0, len(nums) - k + 1):
#            res.append(max(nums[i:i + k]))
#        return res    


class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        deque = collections.deque()
        res, n = [], len(nums)
        for i, j in zip(range(1 - k, n + 1 - k), range(n)):
            if i > 0 and deque[0] == nums[i - 1]:
                deque.popleft() # 删除 deque 中对应的 nums[i-1]
            while deque and deque[-1] < nums[j]:
                deque.pop() # 保持 deque 递减
            deque.append(nums[j])
            if i >= 0:
                res.append(deque[0]) # 记录窗口最大值
        return res
