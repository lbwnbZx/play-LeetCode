# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

# 搜索二叉树的中序遍历是有序递增序列
class Solution:
    def kthLargest(self, root: TreeNode, k: int) -> int:
        self.res = []
        def dfs(root):
            if not root : return 
            dfs(root.left)
            self.res.append(root.val)
            dfs(root.right)

        dfs(root)
        return self.res[len(self.res) - k]
