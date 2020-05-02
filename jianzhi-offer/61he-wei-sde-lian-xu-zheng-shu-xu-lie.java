class Solution {
    public int[][] findContinuousSequence(int target) {
        int i = 1;
        int j = 1;
        int sum = 0;
        List<int []> res =  new ArrayList<>();

        while(i <= target/2){
            if(sum < target){
                //右边界右移
                sum += j;
                j++;
            }else if(sum > target){
                //左边界右移
                sum -= i;
                i++;
            }else{
                int [] arr = new int[j-i];
                for(int k=i;k<j;k++){
                    arr[k-i]=k;
                }
                res.add(arr);
                //左边界向右移动
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
     }
}