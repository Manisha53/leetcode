/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
*/

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp != null){
            while(temp.next != null && temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
                
        
        return head;
    }
}
/*Runtime: 1 ms, faster than 79.17% of Java online submissions for Remove Duplicates from Sorted List.
Memory Usage: 45.2 MB, less than 5.68% of Java online submissions for Remove Duplicates from Sorted List.
*/
