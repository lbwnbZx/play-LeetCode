/*从尾到头打印链表
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
利用辅助栈
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
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack=new Stack();
        ListNode temp=head;
        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }
        int size=stack.size();
        int result[]=new int[size];
        for(int i=0;i<size;i++){
            result[i]=stack.pop();
        }
        return result;
    }
}