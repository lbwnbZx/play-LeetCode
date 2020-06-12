/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ls=new ListNode(0);//链表第一个值为0
        ListNode head=ls;//指向头结点
        int carry=0;//进位 等于0或1
        int sum=0;


        while(l1!=null||l2!=null){
            int x=(l1!=null)?l1.val:0;  //l1.next存在，则x=l1.val  否则x=0
            int y=(l2!=null)?l2.val:0;
            sum=x+y+carry;
            carry=sum/10;

            ls.next=new ListNode(sum%10);
            ls=ls.next;

            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }

        //到最高位  如果carry为1，则需要再加一个1 
        if(carry==1){
            ls.next=new ListNode(carry);
        }

        return head.next;
    }
}