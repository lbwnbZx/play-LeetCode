class Solution {
    public String minNumber(int[] nums) {
        String []strs= new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strs[i]=String.valueOf(nums[i]);
        }
        fastSort(strs,0,strs.length-1);
        StringBuilder res = new StringBuilder();
        for(String s:strs){
            res.append(s);
        }
        return res.toString();
    }
    //快排
    private void fastSort(String[] strs,int l,int r){
        if(l>=r) return;
        int i=l,j=r;
        String tmp = strs[l];//基准位
        while(i<j){
            //先看右边，依次往左递减
            while(i<j&&(strs[j]+strs[l]).compareTo(strs[l]+strs[j])>=0) j--;
            //再看左边，依次往右递增
            while(i<j&&(strs[i]+strs[l]).compareTo(strs[l]+strs[i])<=0) i++;
            
            //满足条件就交换
            tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;
        }
        //最后将基准为与i和j相等位置的数字交换
        strs[i] = strs[l];
        strs[l] = tmp;

        fastSort(strs, l, i - 1);
        fastSort(strs, i + 1, r);
     }
}