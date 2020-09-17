class Solution:
    def __init__(self):
        self.res = 0
    def sumNums(self, n: int) -> int:
        n > 0 and self.sumNums(n-1)  # n>0起短路效应
        self.res += n
        return self.res
