/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //双指针法
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA , pb = headB;
        while(pa!=pb){
            pa = pa == null ? pa = headB : pa.next;
            pb = pb == null ? pb = headA : pb.next; 
        }
        return pa;
    }
}
