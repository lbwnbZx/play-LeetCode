/*
重建二叉树
输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
*/

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //递归结束条件
        if(preorder.length<1){
            return null;
        }
        int rootValue=preorder[0];//根节点的值
        int rootIndex=0;//存储根节点在中序遍历中的下标
        //寻找root结点在inorder中的位置
        for(int val:inorder){
            if(val==rootValue){
                break;
            }
            ++rootIndex;
        }
        TreeNode root=new TreeNode(rootValue);
        //开始递归
        root.left=buildTree(Arrays.copyOfRange(preorder,1,rootIndex+1),Arrays.copyOfRange(inorder,0,rootIndex));
        root.right=buildTree(Arrays.copyOfRange(preorder,rootIndex+1,preorder.length),Arrays.copyOfRange(inorder,rootIndex+1, preorder.length));
        return root;
    }    
}