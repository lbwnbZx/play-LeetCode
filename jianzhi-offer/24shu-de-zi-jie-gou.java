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
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null) return false;
        return isMatch(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }
    public boolean isMatch(TreeNode subA,TreeNode subB){
        if(subB == null) return true;
        if(subA == null) return false;
        return subA.val == subB.val && isMatch(subA.left, subB.left) && isMatch(subA.right, subB.right);
    }
}