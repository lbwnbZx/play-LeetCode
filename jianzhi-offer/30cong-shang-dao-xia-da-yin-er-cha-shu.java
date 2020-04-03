/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*BFS
*/ 
class Solution {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        List<Integer> list=new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node.right);
        }
        int []res=new int[list.size()];
        int i=0;
        for(Integer t : list){
            res[i++]=t;
        }
        return res;


    }
}