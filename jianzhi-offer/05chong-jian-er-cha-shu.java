/*
�ؽ�������
����ĳ��������ǰ���������������Ľ�������ؽ��ö����������������ǰ���������������Ľ���ж������ظ������֡�
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
        //�ݹ��������
        if(preorder.length<1){
            return null;
        }
        int rootValue=preorder[0];//���ڵ��ֵ
        int rootIndex=0;//�洢���ڵ�����������е��±�
        //Ѱ��root�����inorder�е�λ��
        for(int val:inorder){
            if(val==rootValue){
                break;
            }
            ++rootIndex;
        }
        TreeNode root=new TreeNode(rootValue);
        //��ʼ�ݹ�
        root.left=buildTree(Arrays.copyOfRange(preorder,1,rootIndex+1),Arrays.copyOfRange(inorder,0,rootIndex));
        root.right=buildTree(Arrays.copyOfRange(preorder,rootIndex+1,preorder.length),Arrays.copyOfRange(inorder,rootIndex+1, preorder.length));
        return root;
    }    
}