class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){//如果相等的话，直接j++往后走，  如果不等的话，i指针后移一位，令nums[i]=nums[j]
                    i++;
                    nums[i]=nums[j];
            }
            
        }
        return i+1;
    }
}