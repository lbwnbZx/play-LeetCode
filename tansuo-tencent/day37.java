//��������������
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
        int leftMaxDepth=maxDepth(root.left);//������������������
        int rightMaxDepth=maxDepth(root.right);//������������������
        //��ĳ���ڵ�Ϊ���ڵ������������Ϊmax
        //max=max(leftMaxDepth,rightMaxDepth)+1
        return Math.max(leftMaxDepth, rightMaxDepth) + 1;

    }
}