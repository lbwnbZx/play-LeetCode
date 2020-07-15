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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int len = queue.size();
            for(int i = 0;i < len;i++){
                TreeNode node = queue.poll();
                if(depth % 2 == 0) temp.add(node.val);
                else temp.add(0,node.val);//奇数层反向存储
                
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            depth++;
            res.add(temp);
        }
        return res;
    }
}
