/*
两个数组分别记录某个位置之前和之后的数字的乘积，最后将这两个数组相乘
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int []res=new int[len];
        int []fro=new int [len];
        int []back=new int [len];
        
        fro[0]=1;//因为是乘法，第一个得设1才能进行
        back[len -1]=1;//同理
        
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