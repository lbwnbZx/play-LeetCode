/*
//求和
class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int n=0,m=0;
        for(int i=0;i<=len;i++){
            n+=i;
        }
        for(int i=0;i<len;i++){
            m+=nums[i];
        }
        return n-m;
    }
}
*/


//二分法
class Solution {
    public int missingNumber(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]==m) i=m+1;
            else j=m-1;
        }
        return i;
    }
}