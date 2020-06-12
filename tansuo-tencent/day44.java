/*
//暴力
class Solution {
    
    public int climbStairs(int n) {
        return climb_Stairs(0,n);
    
    }
    //i为当前台阶数，n为总台阶数
    public int climb_Stairs(int i,int n){
        if(i>n){
            return 0;
        }
        if(i==n){
            return 1;
        }
        return climb_Stairs(i+1,n)+climb_Stairs(i+2,n);
    }
*/
/*
//动态规划
class Solution {   
    public int climbStairs(int n) {
         if(n==1){
            return 1;
        }
        int []dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i = 3;i <=n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}    
*/
//斐波那契
class Solution {   
    public int climbStairs(int n) {
        int first = 1;
        int second = 2;
        for(int i = 3 ; i<= n ; i++){
            int thrid = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}
    
    