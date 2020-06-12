/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*�鲢����  �ݹ鷨
ʱ�临�Ӷ��뵽���ַ�->�鲢����
�鲢����ռ临�Ӷ�ΪO��n���ɿ���������O��n���͵ݹ����O(logn)���

*/
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        
        ListNode fast=head.next,slow=head;//���ڷָ�����
        while(fast!=null&&fast.next!=null){//�������ڵ��ҵ��е㣬ż�����ڵ��ҵ�������ߵĽڵ�
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode tmp=slow.next;//tmpΪ�ڶ��������ͷ���
        slow.next=null;//��һ��������Ͽ�
        ListNode left=sortList(head);
        ListNode right=sortList(tmp);
        ListNode h=new ListNode(0);//��������ͷ��
        ListNode res=h;//���ڷ�������
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