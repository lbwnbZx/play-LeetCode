class Solution {
    /*
    //方法一  直接合并然后排序
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       System.arraycopy(nums2,0,nums1,m,n);
       Arrays.sort(nums1); 
    }
    */
    //方法二   双指针
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []nums1_copy=new int[m];//保存nums1的元素
        System.arraycopy(nums1,0,nums1_copy,0,m);
        int p1=0;//nums1_copy的指针
        int p2=0;//nums2的指针
        int p=0;//nums1的指针
        
        while((p1<m)&&(p2<n)){
            nums1[p++]=(nums1_copy[p1]<nums2[p2])?nums1_copy[p1++]:nums2[p2++];
        }
        if(p1<m){
            System.arraycopy(nums1_copy,p1,nums1,p1 + p2, m + n - p1 - p2);
        }
        if (p2 < n){
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2); 
        }
      
        
    }
}