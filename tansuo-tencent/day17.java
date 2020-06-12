class Solution {
    public int[][] generateMatrix(int n) {
        int l=0,r=n-1,t=0,b=n-1;//left  right   top   bottom
        int [][]mat=new int [n][n];
        int num=1,tar=n*n;
        while(num<=tar){
            for(int i=l;i<=r;i++){//from left to right
                mat[t][i]=num++;
            }
            t++;//���±߽磬����������֮���ϱ߽�t+1���ϱ߽�������1
            for(int i=t;i<=b;i++){
                mat[i][r]=num++;
            }
            r--;//�ұ߽�������1
            for(int i=r;i>=l;i--){
                mat[b][i]=num++;
            }
            b--;
            for(int i=b;i>=t;i--){
                mat[i][l]=num++;
            }
            l++;  
        }
        return mat;
    }
}