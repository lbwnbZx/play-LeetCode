/*
//��β˫ָ��
class Solution {
    public int[] exchange(int[] nums) {
        int left=0,right=nums.length-1;
        int temp=0;
        while(left<right){
            if(nums[left]%2!=0){
                left++;
                continue;
            }
            if(nums[right]%2==0){
                right--;
                continue;
            }

            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
        }

        return nums;    
    }
}
*/
//����˫ָ��
//fast��������������low����ָ����һ�����������λ��
class Solution {
    public int[] exchange(int[] nums) {
        int low=0,fast=0;
        int temp;
        while(fast<nums.length){
            if(nums[fast]%2!=0){
                
                temp=nums[low];
                nums[low]=nums[fast];
                nums[fast]=temp;

                low++;
            }
            fast++;
        }
        return nums;
    }
}