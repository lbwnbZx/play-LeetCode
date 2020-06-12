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
//��ϣ��    �ռ临�Ӷ�O(n),ʱ�临�Ӷ�O��n��
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
            }
            head=head.next;
        }
        return false;
    }
}
*/
//����ָ��  �ռ临�Ӷ�O��1��
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {            
        	slow = slow.next;
        	fast = fast.next.next;
        	if (slow == fast) {
        		return true;
        	}
        }
        return false;
    }
}