# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def pathSum(self, root: TreeNode, sum: int) -> List[List[int]]:
        res, path = [],[]
        def recur(root, tar):
            if not root : return 
            path.append(root.val)
            tar -= root.val
            if tar == 0 and not root.left and not root.right:
                res.append(list(path))  # 此处必须为list(path),相当于复制了一个path存到res中
            recur(root.left,tar)
            recur(root.right,tar)
            path.pop()

        recur(root, sum) 
        return res       
