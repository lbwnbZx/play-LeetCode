/*������һ��m��n�еķ��񣬴����� [0,0] ������ [m-1,n-1] ��һ�������˴����� [0, 0] �ĸ��ӿ�ʼ�ƶ�����ÿ�ο��������ҡ��ϡ����ƶ�һ�񣨲����ƶ��������⣩��Ҳ���ܽ�������������������λ֮�ʹ���k�ĸ��ӡ����磬��kΪ18ʱ���������ܹ����뷽�� [35, 37] ����Ϊ3+5+3+7=18���������ܽ��뷽�� [35, 38]����Ϊ3+5+3+8=19�����ʸû������ܹ�������ٸ����ӣ�
*/
/*DFS
�ݹ��������ǰԪ���ھ����е��������� i �� j �����ߵ���λ�� si, sj
��ֹ������i��j�����߽磬λ���ͳ���k����ǰ�����Ѿ������ʹ�������0
*/
/*
class Solution {
    boolean [][]visited;
    int m,n,k;
    public int movingCount(int m, int n, int k) {
        this.m=m;this.n=n;this.k=k;
        this.visited=new boolean[m][n];//boolean ������Ԫ�ص�Ĭ�ϳ�ʼֵ�� false
        return dfs(0,0,0,0);
    }
    public int dfs(int i,int j,int si,int sj){
        if(i<0||i>=m||j<0||j>=n||k<si+sj||visited[i][j]) return 0;
        visited[i][j]=true;
        return 1+dfs(i+1,j,(i+1)%10==0?si-8:si+1,sj)+dfs(i,j+1,si,(j+1)%10==0?sj-8:sj+1);
    }
}
*/

//BFS ʹ�ö���ʵ�ֹ�����ȱ���
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