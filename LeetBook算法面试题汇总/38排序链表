/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*归并排序  递归法
时间复杂度想到二分法->归并排序
归并排序空间复杂度为O（n）由开辟新数组O（n）和递归调用O(logn)组成

*/
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        
        ListNode fast=head.next,slow=head;//用于分割链表
        while(fast!=null&&fast.next!=null){//奇数个节点找到中点，偶数个节点找到中心左边的节点
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode tmp=slow.next;//tmp为第二条链表的头结点
        slow.next=null;//将一整条链表断开
        ListNode left=sortList(head);
        ListNode right=sortList(tmp);
        ListNode h=new ListNode(0);//辅助链表头部
        ListNode res=h;//便于返回链表
        while(left!=null&&right!=null){
            if(left.val<right.val){
                h.next=left;
                left=left.next;
            }else{
                h.next=right;
                right=right.next;
            }
            h=h.next;
            
        }
        h.next=(left!=null)?left:right;
        return res.next;
    }
}
