class Solution {
    public int[] constructArr(int[] a) {
        int len = a.length;
        int res[]=new int[len];
        //先乘左边的数
        for(int i=0,product=1;i<len;i++){
            res[i]=product;
            product*=a[i];
        }
        //再乘右边的数
        for(int i=len-1,product=1;i>=0;i--){
            res[i]*=product;
            product*=a[i];
        }
        return res;
    }
}

