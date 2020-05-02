//双指针
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j =nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum > target) j -= 1;
            else if(sum < target) i+=1;
            else return new int[]{nums[i]+nums[j]};
        } 
        return new int [0];
    }
}