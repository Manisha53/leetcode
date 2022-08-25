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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head; 
        int length=0,mid=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        mid=length/2;
        
        ListNode current=head;
        while(mid-->0){
            current=current.next;           
        }
        
        return current;
    }
}
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
Memory Usage: 41.6 MB, less than 48.07% of Java online submissions for Middle of the Linked List.
*/
