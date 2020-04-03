/*题目：二维数组中的查找
在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

思路：数组左下角元素一定是所在列的最大元素，所在行的最小元素
如果target比此元素大，目标值一定在右边
如果target比此元素小，则目标值一定在上边
*/

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
           int i=matrix.length-1;
           int j=0;
           while(i>-1&&j<matrix[0].length){
            if(matrix[i][j]<target)
                j++;
            else if(matrix[i][j]>target)    
                i--;
            else
                return true;    
           }
            return false;
    }
}