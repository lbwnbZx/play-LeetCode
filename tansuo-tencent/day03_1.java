//时间复杂度不符合要求    O(m+n)
import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length + nums2.length;
        int  num[]=new int[len];
        int index=0;//记录新数组下标
        //把两个数组合为一个有序数组
        for(int i=0;i<nums1.length;i++){
            num[index]=nums1[i];
            index++;
        }
        for(int i=0;i<nums2.length;i++){
            num[index]=nums2[i];
            index++;
        }
        
        //数组排序
        Arrays.sort(num);
        double  result=0;
        
        //计算中位数
        if(len%2==0){
            result=(double)(num[len/2-1]+num[len/2])/2;//数组长度比下标多1 所以是len/2-1
        }else{
            result=(double)num[len/2];
        }
            
        return result;
    }
}