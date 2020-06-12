/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//只告诉我们要删除的结点  不知道要删除结点的前面的结点
//找一个可以知道上一个结点的结点，把它变成要删除的节点，然后删除它
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}