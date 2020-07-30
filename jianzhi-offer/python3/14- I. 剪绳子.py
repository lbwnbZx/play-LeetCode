class Solution:
    def cuttingRope(self, n: int) -> int:
        # 3为最优解，把绳子按3切分，最后会剩下0,1,2
        # 3+1=4=2*2>3*1
        if n <= 3: return n-1
        a,b = n // 3,n % 3 # 双斜杠为地板除

        if b == 0: return int(math.pow(3,a))
        if b == 1: return int(math.pow(3,a-1)*4)
        return int(math.pow(3,a)*2)
