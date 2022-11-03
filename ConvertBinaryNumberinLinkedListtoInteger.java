/*
1290. Convert Binary Number in a Linked List to Integer
Easy

3189

140

Add to List

Share
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

 

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0
 

Constraints:

The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.

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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int dec=0;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        ListNode deci=head;
        n=n-1;        // as indexing starts from 0 while binary to decimal conversion
        while(n>=0){
           dec+=Math.pow(2,n)*deci.val; 
            deci=deci.next;
            n--;
            
        }
        return dec;
    }
}

/*
Runtime: 1 ms, faster than 42.50% of Java online submissions for Convert Binary Number in a Linked List to Integer.
Memory Usage: 41.4 MB, less than 60.42% of Java online submissions for Convert Binary Number in a Linked List to Integer.
*/
