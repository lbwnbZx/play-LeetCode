
/*1.序列化和反序列化二叉树，是可逆操作，则通常的前中后序遍历记录的二叉树信息不完整，可能对应多个二叉树结果。因此，序列化的字符串应携带 “完整的” 二叉树信息，即拥有单独表示二叉树的能力。
2.  node在序列中的索引是n,则node.left的索引为2n+1，node.right的索引为2n+2
3.  借助队列，对二叉树做层序遍历，并将越过叶节点的 nullnull 也打印出来。
4. 若root为空，则直接返回空链表
5. 队列queue，序列化列表res
6. 拼接列表（用 ',' 隔开，首尾添加中括号）。
7. 反序列化
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
public class Codec {
    public String serialize(TreeNode root) {
        if(root == null) return "[]";
        StringBuilder res = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node != null) {
                res.append(node.val + ",");
                queue.add(node.left);
                queue.add(node.right);
            }
            else res.append("null,");
        }
        res.deleteCharAt(res.length() - 1);//删除最后的逗号
        res.append("]");
        return res.toString();
    }

    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        String[] vals = data.substring(1, data.length() - 1).split(",");//substring返回字符串的子字符串，左闭右开
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));//String转化为int
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(!vals[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.left);
            }
            i++;
            if(!vals[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}


// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));

