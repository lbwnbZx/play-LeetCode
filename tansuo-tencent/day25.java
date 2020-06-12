/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/*
//π˛œ£±Ì ø’º‰∏¥‘”∂»O£®n£©
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return head;
            }else{
                set.add(head);
                head=head.next;
            }
            
        }
        return null;
    }
}
*/
//∏£¬Â“¡¥ÔÀ„∑®  ø’º‰∏¥‘”∂»O£®1£©
public class Solution {
    private ListNode getIntersect(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next != null && fast.next.next != null) {            
        	slow = slow.next;
        	fast = fast.next.next;
        	if (slow == fast) {
        		return fast;
        	}
        }
        return null;
    }
    
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode intersect = getIntersect(head);
        if (intersect == null) {
            return null;
        }
         ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }
}