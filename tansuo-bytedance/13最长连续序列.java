class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int res=1,cur=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) continue;
            if(nums[i]+1==nums[i+1]) cur++;
            else cur=1;
            
            res=res>cur?res:cur;
        }
        return res;
    }
}
