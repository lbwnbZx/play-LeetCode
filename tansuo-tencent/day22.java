/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int len=lists.length;
        if(len==0) return null;
        //��n���������м�Գƺϲ�
        while(len>1){
            for (int i=0; i<len/2; i++) {
                lists[i] = mergeTwoLists(lists[i], lists[len-1-i]);
            }
            len = (len+1)/2;//һ����ɺ�������ֲ���1�ͣ�len+1��/2֮��
        }
        return lists[0];
    }
    
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode ls=new ListNode(0);
        ListNode head =ls;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                ls.next=l1;
                l1=l1.next;
            }else{
                ls.next=l2;
                l2=l2.next;
            }
            ls=ls.next;
        }
        if(l1!=null){
            ls.next=l1;
        }
        if(l2!=null){
            ls.next=l2;
        }
        return head.next;
    }
}