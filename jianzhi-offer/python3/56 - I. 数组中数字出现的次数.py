class Solution:
    def singleNumbers(self, nums: List[int]) -> List[int]:
        ret, a, b = 0, 0, 0 # ret 为所有数字异或的结果
        for num in nums:
            ret ^=num
        h = 1
        while (ret & h == 0):
            h<<=1 # 找出ret中位数为1 的那一位
        for num  in nums :
            if(h & num == 0): a ^= num
            else: b^=num
        return [a, b]    
