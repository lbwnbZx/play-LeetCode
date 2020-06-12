//�����������е�KС��Ԫ��
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*BST�������������������������������������Ǵ�С������������k-1��Ԫ�ؾ��ǵ�kС��Ԫ��
�ݹ�
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
//����������ջ������Ҫ����������
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack=new LinkedList<>();//ListedList��һ��˫������ÿ���ڵ�����˶�ǰһ��Ԫ�غͺ�һ��Ԫ�ص�����
        while(true){
            while(root!=null){//����������
                stack.add(root);
                root=root.left;
            }
            root=stack.removeLast();
            if (--k == 0)  return root.val;//��--��Ȼ����ж�
            root = root.right;
        }
    }
}