/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode next=null;
        ListNode temp=head;
        while(temp != null){
            next=temp.next;
            temp.next=prev;   
            prev=temp;
            temp=next;
        }
    
        return prev;
    }
}
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
Memory Usage: 43.1 MB, less than 43.57% of Java online submissions for Reverse Linked List.
*/
