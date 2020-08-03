class Solution:
    def myPow(self, x: float, n: int) -> float:
        if x == 0: return 0
        res = 1
        if n < 0: x, n = 1 / x, -n # 当n < 0时，转化为n>=0的范围内
        while n:
            if n & 1: res *= x
            x *= x
            n >>= 1
        return res
