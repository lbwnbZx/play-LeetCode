
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//先将链表闭合成环   然后找到断开的位置
//要断开的位置为len-k
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;
        
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        tail.next=head;
        
        ListNode new_tail=head;
        for(int i=1;i<=len-(k%len);i++){
            head=head.next;
            tail=tail.next;
        }
        tail.next=null;
        return head;
    }
}