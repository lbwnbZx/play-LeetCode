/*
class Solution {
    List<List<Integer>> output = new ArrayList<>();
    int n,k;
    
    public List<List<Integer>> subsets(int[] nums) {
        n=nums.length;
        for(k=0;k<n+1;k++){
            backtrack(0,new ArrayList<Integer>(),nums);
        }
        return output;
    }
    
    public void backtrack(int first,ArrayList<Integer> curr,int[]nums){
         if (curr.size() == k)  
             output.add(new ArrayList(curr));
        for(int i=first;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(i+1,curr,nums);
            curr.remove(curr.size() - 1);
        }
        
    }
    
}
*/


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<Integer>());
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
