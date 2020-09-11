# dp[i][j]表示投掷完第i个筛子之后出现点数j的次数
# dp[n][j]表示最后一个阶段点数j出现的次数
# 投掷完n枚筛子之后点数j出现的次数，可以由投掷完第n-1 枚骰子后，对应点数j-1,j-2,j-3,j-4,j-5,j-6出现的次数之和转化过来
# 得状态转移方程： dp[n][j] = dp[n-1][j-1]+dp[n-1][j-2]+...+dp[n-1][j-6]
class Solution:
    def twoSum(self, n: int) -> List[float]:

        dp = [ [0 for _ in range(6*n+1)] for _ in range(n+1)]
        for i in range(1,7):
            dp[1][i] = 1

        for i in range(2,n+1):
            for j in range(i,i*6+1):
                for k in range(1,7):
                    if j >= k+1:
                        dp[i][j] +=dp[i-1][j-k]
        res = []
        for i in range(n,n*6+1):
            res.append(dp[n][i]*1.0/6**n)
        return res
