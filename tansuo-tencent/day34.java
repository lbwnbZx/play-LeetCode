/*ʱ�临�Ӷ�O��log n������O��n��    ��ʾ�ö��ַ�
�ҵ���ת���±�rotation_index Ҳ����С��Ԫ��
*/
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0||nums==null){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            //ǰ�벿������
            if(nums[start]<=nums[mid]){
                //target��ǰ�벿��
                if(target>=nums[start] && target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            //��벿������    
            }else{
                //target�ں�벿��
                if(target<=nums[end]&&target>nums[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}