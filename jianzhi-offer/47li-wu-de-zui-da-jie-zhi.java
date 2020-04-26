/*动态规划
f(i,j)=max(f(i-1,j),f(i,j-1))+当前单元格礼物的价值grid(i,j)

*/
class Solution {
    public int maxValue(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j==0) continue;
                if(i==0) grid[i][j] +=grid[i][j-1];
                else if(j==00) grid[i][j]+=grid[i-1][j];
                else grid[i][j] +=Math.max(grid[i][j-1], grid[i-1][j]); 
            }
        }
        return grid[m-1][n-1];
    }
}