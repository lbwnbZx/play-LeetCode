"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""
class Solution:
    def copyRandomList(self, head: 'Node') -> 'Node':
        # 将链表看成一个图，用dfs/bfs遍历
        # dfs
        # 从头结点开始copy，由于一个结点可能被多个指针指到，因此如果已经被拷贝，则不需要重复拷贝
        # 如果还没拷贝该结点，则创建一个新的结点进行拷贝，并将拷贝过的结点保存在哈希表中
        # 使用递归拷贝所有的 next 结点，再递归拷贝所有的 random 结点
        def dfs(head):
            if not head : return None
            if head in visited :
                return visited[head]
            # 创建新节点
            copy = Node(head.val, None, None)
            visited[head] = copy
            copy.next = dfs(head.next)
            copy.random = dfs(head.random)
            return copy
        visited = {}
        return dfs(head) 
