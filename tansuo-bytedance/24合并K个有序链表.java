/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//逐一合并两条链表
class Solution {
    public ListNode merge2Lists(ListNode l1,ListNode l2){
        ListNode head = new ListNode(0);
        ListNode temp = head;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = (l1 == null) ? l2 : l1;
        
        return head.next; 
        
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for(ListNode list:lists){
            res = merge2Lists(res,list);
        }
        return res;
    }
}
