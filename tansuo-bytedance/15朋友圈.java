//看做是图的邻接矩阵，求无向图连通块的个数
/*
//dfs
class Solution {
    public  void dfs(int [][]M,boolean []flag,int i){
        flag[i]=true;
        
        for(int j=0;j<M[i].length;j++){
            if(flag[j]==false &&M[i][j]==1){
                dfs(M,flag,j);
            }        
        } 
    }
    public int findCircleNum(int[][] M) {
        int length=M.length;//二维数组的长度，表示人的个数
        int count=0;//计数
        boolean []flag = new boolean[length];
        for(int i=0;i<length;i++){
            if(flag[i]==false){
                dfs(M,flag,i);
                count++;
            }
        }
        return count;
    }
}
*/
//bfs
class Solution {
    public int findCircleNum(int[][] M) {
        boolean[] visited = new boolean[M.length];
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<M.length;i++){
            if(visited[i] == false){
                queue.add(i);
                while(!queue.isEmpty()){
                    int s = queue.remove();
                    visited[s]=true;
                    
                    for(int j=0;j<M.length;j++){
                        if(M[s][j]==1&&visited[j]==false){
                            queue.add(j);
                        }
                    }
                }
                count++;
            }
        }
        return count;
    }
}
