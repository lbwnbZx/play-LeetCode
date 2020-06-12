/*
//用二维数组存储数据
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++) dp[i][0]=1;
        for(int j=0;j<n;j++) dp[0][j]=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
*/


//将二维数组优化为一维数组
class Solution {
    public int uniquePaths(int m, int n) {
        int []dp = new int[n];
        Arrays.fill(dp,1);
        for (int i = 1; i < m;i++){
            for (int j = 1; j < n; j++){
                dp[j] += dp[j-1] ;
            }
        }
        return dp[n-1];
    }
}
