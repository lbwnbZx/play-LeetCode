/*�������������ͷָ���һ��Ҫɾ���Ľڵ��ֵ������һ������ɾ���ýڵ㡣
����ɾ����������ͷ�ڵ㡣
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