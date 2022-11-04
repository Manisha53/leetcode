```
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0); //dummy node to act as head for the final-sum linked list
        ListNode tail=dummy; // to add the single digit to it for adding the elements.
        int carry=0; // initially it would be 0
        
        while(l1!=null || l2!=null){ // '||' operator is used for the case when either of the 2 lists are exhaused then, the remaining elements of un-exhauseted list can be added to the final sum
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            
            tail.next=new ListNode(sum%10); //the digit which would be part of the final sum
            tail=tail.next;
            
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry>0) tail.next=new ListNode(carry); //important step to add carry at msd if it exixts.
        
        return dummy.next; // since the first node has a dummy value i.e. 0 ,so dummy.next will give the actual sum.
    }
}
```
