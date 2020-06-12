/*
��������ֱ��¼ĳ��λ��֮ǰ��֮������ֵĳ˻�������������������
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int []res=new int[len];
        int []fro=new int [len];
        int []back=new int [len];
        
        fro[0]=1;//��Ϊ�ǳ˷�����һ������1���ܽ���
        back[len -1]=1;//ͬ��
        
        for(int i=1;i<len;i++){
            fro[i]=fro[i-1]*nums[i-1];
            back[len -1-i]=back[len -i]*nums[len -i];
        
        }
        for (int i = 0; i < len; i++) {
            res[i]=fro[i]*back[i];
        }
        return res;

    }
}