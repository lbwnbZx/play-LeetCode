/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//ֻ��������Ҫɾ���Ľ��  ��֪��Ҫɾ������ǰ��Ľ��
//��һ������֪����һ�����Ľ�㣬�������Ҫɾ���Ľڵ㣬Ȼ��ɾ����
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}