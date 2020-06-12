/*
要求使用线性时间复杂度和常数空间复杂度
使用位运算，异或运算：
任何数和0做异或都为本身
两个相同的数异或结果为0

*/
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums){
            res ^= num;
        }
        return res;
    }
}