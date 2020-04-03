
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
        if(head==null) return null;
        ListNode res=new ListNode(0);
        res.next=null;
        ListNode temp=null;
        while(head!=null){
            temp=head;
            head=head.next;
            temp.next=res.next;
            res.next=temp;
        }
        return res.next;
    }
}