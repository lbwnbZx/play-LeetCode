//先根据区间的起始位置排序，再进行n−1 次两两合并。
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(v1,v2)->v1[0]-v2[0]);
        
        int [][]res = new int[intervals.length][2];
        int index = -1;
        //两两合并
        for(int[] interval:intervals){
            //当前区间的起始位置大于结果数组中最后区间的终止位置
            if(index==-1 || interval[0]>res[index][1]){
                   res[++index]=interval;
            } else{
            //反之将当前区间合并到结果数组中的最后一个区间
                res[index][1]=Math.max(res[index][1], interval[1]);
            }
        }
        
        return Arrays.copyOf(res,index+1);
    }
}
