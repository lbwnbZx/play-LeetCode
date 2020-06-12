/*时间复杂度O（log n）不是O（n）    提示用二分法
找到旋转的下标rotation_index 也是最小的元素
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
            //前半部分有序
            if(nums[start]<=nums[mid]){
                //target在前半部分
                if(target>=nums[start] && target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            //后半部分有序    
            }else{
                //target在后半部分
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