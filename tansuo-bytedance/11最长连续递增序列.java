class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0) return 0;
        int res=1,cur=1;
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i+1]>nums[i]) cur++;
            else cur=1;
            
            res= res>cur?res:cur;
        }
        return res;
    }
}