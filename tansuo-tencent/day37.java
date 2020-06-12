//二叉树的最大深度
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
    
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int leftMaxDepth=maxDepth(root.left);//计算左子树的最大深度
        int rightMaxDepth=maxDepth(root.right);//计算右子树的最大深度
        //以某个节点为根节点的数的最大深度为max
        //max=max(leftMaxDepth,rightMaxDepth)+1
        return Math.max(leftMaxDepth, rightMaxDepth) + 1;

    }
}