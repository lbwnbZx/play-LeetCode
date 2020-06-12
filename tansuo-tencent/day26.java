
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/*
//ʱ�临�Ӷ�O��m+n���ռ临�Ӷ�O��m����O��n��
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        Set<ListNode> set=new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(set.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}
*/
/*˫ָ�뷨
ʱ�临�Ӷ� : O(m+n)  �ռ临�Ӷ� : O(1)
˫ָ���ֻ�����A�����B����
*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        
        ListNode pointA=headA;
        ListNode pointB=headB;
        while(pointA!=pointB){
            pointA=(pointA==null)?(headB):(pointA.next);
            pointB=(pointB==null)?(headA):(pointB.next);
        }
        return pointA;
    }
}