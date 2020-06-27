//二分法  找出旋转点
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0||nums==null) return -1;

        int left=0,right=nums.length-1;
        int mid;
        
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid] == target) return mid;
            
            //前半部分有序
            if(nums[left]<=nums[mid]){
                //target在前半部分
                if(target>=nums[left]&&target<nums[mid]) right=mid-1;
                else left=mid+1;
            //后半部分有序    
            }else{
                //target在后半部分
                if(target<=nums[right]&&target>nums[mid]) left=mid+1;
                else right=mid-1;
            }
        }
        return -1;
    }
}