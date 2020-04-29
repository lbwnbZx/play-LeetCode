/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /*
 //DFS
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
 */
 
//层次遍历
class Solution{
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        int res=0;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> tmp;
        queue.offer(root);
        while(!queue.isEmpty()){
            tmp = new LinkedList<>();
            for(TreeNode q:queue){
                if(q.left != null) tmp.offer(q.left);
                if(q.right != null) tmp.offer(q.right);
            }
            res++;
            queue=tmp;
        } 
        return res;
    }
}