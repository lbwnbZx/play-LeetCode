//二叉搜索树中第K小的元素
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*BST（二叉排序树或二叉搜索树）的中序遍历就是从小到大的排序，则第k-1个元素就是第k小的元素
递归
*/
/*
class Solution {
    ArrayList<Integer> arr=new ArrayList<>();
    
    public ArrayList<Integer> inorder (TreeNode root,ArrayList<Integer> arr){
        if(root==null) return null;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return arr;
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums=inorder(root,arr);
        return nums.get(k-1);
    }
}
*/
//迭代，利用栈，不需要遍历整个树
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack=new LinkedList<>();//ListedList是一个双向链表，每个节点包含了对前一个元素和后一个元素的引用
        while(true){
            while(root!=null){//左子树遍历
                stack.add(root);
                root=root.left;
            }
            root=stack.removeLast();
            if (--k == 0)  return root.val;//先--，然后才判断
            root = root.right;
        }
    }
}