/*ͨ���ݹ��ж�ÿ����������ȷ�ԣ������������������������������������򷵻�true

*/
class Solution {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder == null ||postorder.length<=0) return true;
        return verifyPostorderOfBST(postorder,0,postorder.length-1);
    }

    public boolean verifyPostorderOfBST(int []sequence,int left,int right){
        if(left>right){
            return true;
        }
        //�ڶ����������в���λ�ڸ��ڵ���������ϵĽڵ�
        int i = left;
        while(sequence[i]<sequence[right]){
            i++;
        }
        //�ڶ����������в���λ�ڸ��ڵ���������ϵĽڵ�
        int mid=i;
        while(sequence[i]>sequence[right]){
            i++;
        }
        return i== right && verifyPostorderOfBST(sequence, left, mid-1) && verifyPostorderOfBST(sequence, mid, right-1);
    }
}