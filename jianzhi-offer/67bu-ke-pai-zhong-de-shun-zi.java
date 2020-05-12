class Solution {
    public boolean isStraight(int[] nums) {
        int joker = 0;//记录0的个数
        Arrays.sort(nums);
        for(int i=0;i<4;i++){
            if(nums[i]==0) joker++;
            else if(nums[i]==nums[i+1]) return false;//有重复的牌则直接返回false
        }
        return nums[4]-nums[joker]<5;//最大牌-最小牌<5则构成顺子    

    }
}