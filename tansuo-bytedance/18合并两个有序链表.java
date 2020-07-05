/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode(0);
        ListNode head  = ln;
        while(l1 != null && l2 != null){
            if(l1.val<=l2.val){
                ln.next=l1;
                ln=ln.next;
                l1=l1.next;
                
            }else{
                ln.next=l2;
                ln=ln.next;
                l2=l2.next;
                
            }
        }
        
        if(l1 == null){
            ln.next=l2;
        }
        if(l2 == null){
            ln.next=l1;
        }
        
        return head.next;
    }
}
