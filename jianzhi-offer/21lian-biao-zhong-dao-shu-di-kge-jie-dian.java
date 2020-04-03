/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head==null) return null;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        
        int j=len-k+1;
        for(int i=1;i<j;i++){
            head=head.next;
        }
        
        return head;

    }
}