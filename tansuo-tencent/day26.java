
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
//时间复杂度O（m+n）空间复杂度O（m）或O（n）
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
/*双指针法
时间复杂度 : O(m+n)  空间复杂度 : O(1)
双指针轮换遍历A链表和B链表
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