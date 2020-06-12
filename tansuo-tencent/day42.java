/*给定一个没有重复数字的序列，返回其所有可能的全排列。
示例:
输入: [1,2,3]
输出:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
*/
class Solution {
    //n表示序列元素个数
    public void backtrack(int n,ArrayList<Integer> nums,List<List<Integer>> output,int first){
        if(first==n) output.add(new ArrayList<Integer>(nums));
        for(int i=first;i<n;i++){
           Collections.swap(nums,first,i);
            backtrack(n,nums,output,first+1);
            Collections.swap(nums,first,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output=new LinkedList<>();
        //将nums数组转化为列表
        ArrayList<Integer> temp=new ArrayList<>();
        for(int num:nums){
            temp.add(num);
        } 
        int n=nums.length;
        backtrack(n,temp,output,0);
        return output;
    }
}