/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //2 pointer 
        if(head==null) return false; //empty list
        
            ListNode l=head;
            ListNode r=head;
        
            while(r.next!=null && r.next.next!=null){
               
                     l=l.next;
                     r=r.next.next;
                     if(l==r) return true;
                
            }
         
        return false;
    }
}
/*
Runtime: 1 ms, faster than 46.08% of Java online submissions for Linked List Cycle.
Memory Usage: 45.5 MB, less than 73.11% of Java online submissions for Linked List Cycle.
*/


//*****************no diffrence but complexity reduced***************
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       if(head==null) return false;
       ListNode slow=head;
       ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast) return true;
        }
        return false;
    }
}
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
Memory Usage: 46.7 MB, less than 16.13% of Java online submissions for Linked List Cycle.
*/
