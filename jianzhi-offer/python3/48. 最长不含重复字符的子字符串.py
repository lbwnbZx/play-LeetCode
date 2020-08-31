# 双指针滑动窗口
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        head = 0
        tail = 1
        if len(s) < 2 :return len(s)
        res = 1

        while tail < len(s):
            if s[tail] not in s[head:tail]:
                res = max(tail- head +1,res)
            else:
                while s[tail] in s[head:tail]:
                       head += 1
            tail += 1
        return res                 
