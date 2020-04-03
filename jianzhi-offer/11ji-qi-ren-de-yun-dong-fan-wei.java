/*地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
*/
/*DFS
递归参数：当前元素在矩阵中的行列索引 i 和 j ，两者的数位和 si, sj
终止条件：i、j超出边界，位数和超出k，当前坐标已经被访问过，返回0
*/
/*
class Solution {
    boolean [][]visited;
    int m,n,k;
    public int movingCount(int m, int n, int k) {
        this.m=m;this.n=n;this.k=k;
        this.visited=new boolean[m][n];//boolean 型数组元素的默认初始值是 false
        return dfs(0,0,0,0);
    }
    public int dfs(int i,int j,int si,int sj){
        if(i<0||i>=m||j<0||j>=n||k<si+sj||visited[i][j]) return 0;
        visited[i][j]=true;
        return 1+dfs(i+1,j,(i+1)%10==0?si-8:si+1,sj)+dfs(i,j+1,si,(j+1)%10==0?sj-8:sj+1);
    }
}
*/

//BFS 使用队列实现广度优先遍历
class Solution {
    public int movingCount(int m, int n, int k) {
        boolean[][]visited=new boolean[m][n];
        int res=0;
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0,0,0,0});
        while(queue.size()>0){
            int []x=queue.poll();
            int i=x[0],j=x[1],si=x[2],sj=x[3];
             if(i < 0 || i >= m || j < 0 || j >= n || k < si + sj || visited[i][j]) continue;
            visited[i][j] = true;
            res ++;
            queue.add(new int[] { i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj });
            queue.add(new int[] { i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8 });
        }

        return res;
    }
}