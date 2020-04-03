/*给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
返回删除后的链表的头节点。
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode temp=head;
        if(temp.val==val) return head.next;
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
                return head;
            }
            temp=temp.next;
        }
        return head;
    }
}