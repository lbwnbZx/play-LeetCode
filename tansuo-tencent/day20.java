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
        ListNode ln=new ListNode(0);
        int flag=0;//进位 只可能为1或者0
        int sum=0;//各位的和
        ListNode head =ln;//指向头结点
        
        while(l1!=null||l2!=null){
            int x=(l1!=null)?l1.val:0;    
            int y=(l2!=null)?l2.val:0; 
            sum=x+y+flag;
            flag=sum/10;
            
            ln.next=new ListNode(sum%10);
            ln=ln.next;
            
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        
        //最高位如果进位为1 ，则需要再加一个 1
        if(flag==1){
            ln.next=new ListNode(flag);
            }
     return head.next;   
    }
    
}