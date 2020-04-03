/*��һ������Ϊ n ������ nums ����������ֶ��� 0��n-1 �ķ�Χ�ڡ�������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Ρ����ҳ�����������һ���ظ������֡�
*/
/*
//˫��ѭ��
class Solution {
    public int findRepeatNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            if(nums[i]==nums[j]){
                return nums[i];
            }
        }
        return -1;
    }
}
*/
//��������set���򣬲����ظ�
class Solution{
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int result=-1;
        for(int num:nums){
            if(!set.add(num)){
                result=num;
                break;
            }
        }
        return result;
    }
}