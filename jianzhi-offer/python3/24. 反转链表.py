# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head: return None
        cur = None
        pre = head
        while pre:
            temp = pre.next
            pre.next = cur
            cur = pre 
            pre = temp

        return cur    
