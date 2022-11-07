/*
Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
 

Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109

*/

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate List.
Memory Usage: 42 MB, less than 85.66% of Java online submissions for Rotate List.
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null || k<=0) return head;
        
        ListNode left_end=head;
        ListNode right=head;
        ListNode temp=head;
        int n=1;                         //reason for 100% time efficient
        
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        temp=head;
        if(k%n==0){
            return head;
        }
        int cut=(n-k > 0) ? n-k : n-(k%n);
        
        while(cut!=0 && right!=null){
            left_end=right;
            right=right.next;
            cut--;
        }

        ListNode right_end=right;
        
        while(right_end.next!=null) right_end=right_end.next;
        
        right_end.next=head;
        head=right;
        left_end.next=null;
        
        return head;
    }
}
