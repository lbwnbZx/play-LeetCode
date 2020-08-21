"""
# Definition for a Node.
class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
"""
# 二叉搜索树的中序遍历为有序递增序列
# 前驱结点pre,当前结点cur   pre.right=cur,cur.left=pre
# 链表头结点head,尾结点tail head.left=tail, tail.right=head
# 使用中序遍历访问树的各个结点cur,并在访问每个结点时构建cur和前驱结点pre的引用指向
class Solution:
    def treeToDoublyList(self, root: 'Node') -> 'Node':
        def dfs(cur):
            if not cur: return
            dfs(cur.left) # 递归左子树
            if self.pre: # 修改节点引用
                self.pre.right, cur.left = cur, self.pre
            else: # 记录头节点
                self.head = cur
            self.pre = cur # 保存 cur
            dfs(cur.right) # 递归右子树
        
        if not root: return
        self.pre = None
        dfs(root)
        self.head.left, self.pre.right = self.pre, self.head
        return self.head        
