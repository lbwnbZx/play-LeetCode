/*��Ŀ����ά�����еĲ���
��һ�� n * m �Ķ�ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������

˼·���������½�Ԫ��һ���������е����Ԫ�أ������е���СԪ��
���target�ȴ�Ԫ�ش�Ŀ��ֵһ�����ұ�
���target�ȴ�Ԫ��С����Ŀ��ֵһ�����ϱ�
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