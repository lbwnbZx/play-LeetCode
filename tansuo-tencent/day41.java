/*
子集
给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。

说明：解集不能包含重复的子集。

示例:

输入: nums = [1,2,3]
输出:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/
/*
//递归  看不懂
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output =new ArrayList();
        output.add(new ArrayList<Integer>());
        
        for(int num:nums){
            List<List<Integer>>  newSubsets = new ArrayList();
            for(List<Integer> curr:output){
                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for(List<Integer>curr:newSubsets){
                output.add(curr);
            }
            
        }
        return output;
    }
}
*/
class Solution {
  List<List<Integer>> output = new ArrayList();
  int n, k;

  public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
    // if the combination is done
    if (curr.size() == k)
      output.add(new ArrayList(curr));

    for (int i = first; i < n; ++i) {
      // add i into the current combination
      curr.add(nums[i]);
      // use next integers to complete the combination
      backtrack(i + 1, curr, nums);
      // backtrack
      curr.remove(curr.size() - 1);
    }
  }

  public List<List<Integer>> subsets(int[] nums) {
    n = nums.length;
    for (k = 0; k < n + 1; ++k) {
      backtrack(0, new ArrayList<Integer>(), nums);
    }
    return output;
  }
}