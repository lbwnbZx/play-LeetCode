/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res= new ArrayList<>();
        if(root != null) queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i=queue.size();i>0;i--){
                TreeNode node = queue.poll();
                temp.add(node.val);
                 if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(temp);
        }
        return res;
    }
}