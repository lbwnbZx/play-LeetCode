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
    HashMap<Integer,Integer>map = new HashMap<>();//标记中序遍历
    int po[];//保留的先序遍历
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        po = preorder;
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }

        return recur(0,0,inorder.length-1);
    }

    public TreeNode recur(int pre_root_idx,int in_left_idx,int in_right_idx){
        if(in_left_idx>in_right_idx) return null;
        TreeNode root = new TreeNode(po[pre_root_idx]);   
        int idx = map.get(po[pre_root_idx]);//在中序中找到当前根的索引

        root.left = recur(pre_root_idx+1,in_left_idx,idx-1);
        root.right = recur(pre_root_idx + (idx-1 - in_left_idx +1)  + 1, idx + 1, in_right_idx);
        return root;

    }
}
