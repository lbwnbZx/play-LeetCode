/*
�������飬����������������Ϊһ��������������������������ĺ͵����ֵ
ʹ�ö�̬�滮��
�趯̬�滮�б� dp ��dp[i] ������Ԫ�� nums[i] Ϊ��β����������������
�� dp[i-1]<=0,˵��dp[i-1]��nums[i]���������ס�
��dp[i-1]>0ʱ��ִ��dp[i]=dp[i-1]+nums[i];
��dp[i-1]<=0ʱ��ִ��dp[i]=nums[i];
��ʼ״̬��dp[0]=nums[0]


*/
class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i] += Math.max(nums[i-1],0);
            res = Math.max(res,nums[i]);
        }
        return res;
    }
}