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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         int lenA = 0;
         int lenB = 0;
     
        ListNode head1 = headA;
        ListNode head2 = headB;
        
        while(head1!=null){
            head1 = head1.next;
            lenA++;
        }
        
        while(head2!=null){
            head2 = head2.next;
            lenB++;
        }
        
        head1 = headA;
        head2 = headB;
        
        int i=0;
        
        int diff = Math.abs(lenA-lenB);
        
        while(i<diff){
            if(lenA>lenB){
                head1 = head1.next;
            }
            else{
                head2 = head2.next;
            }
            i++;
        }
        
        while(head1!=null && head2!=null){
            if(head1==head2){
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        
        return null;
        
        
        
        
    }
}
