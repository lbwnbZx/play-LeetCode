/*
//排序取中值
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
*/


//哈希表 遍历数组，数值作为键，次数作为值(flase)
/*
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map[nums[i]]+=1;
            if(map[nums[i]]>nums.length/2){
                return nums[i];
            }
        }
        return 0;
    }
}    

*/
//摩尔投票法
class Solution {
    public int majorityElement(int[] nums) {
       int x=0,votes=0;
       for(int num:nums){
           if(votes == 0) x = num;
           votes += num==x ? 1 : -1;
       }
       return x;
    }
}    