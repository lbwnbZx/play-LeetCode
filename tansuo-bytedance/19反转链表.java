/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        
        while(cur != null){
            temp=cur.next;//当前节点的下一节点
            cur.next=pre;
            pre=cur;
            cur=temp;
            
        }
        return pre;
    }
}
