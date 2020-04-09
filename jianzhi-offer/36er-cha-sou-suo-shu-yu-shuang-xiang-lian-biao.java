/*二叉搜索树的中序遍历是有序递增的
*/
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    Node pre = new Node(0),head = pre;
    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        dfs(root);
        head = head.right;
        head.left = pre;
        pre.right = head;
        return head;
    }
    //在中序遍历中构建双向链表
    public void dfs(Node cur){
        if(cur == null) return;
        dfs(cur.left);
        pre.right=cur;
        cur.left=pre;
        pre=cur;
        dfs(cur.right);

    }
}