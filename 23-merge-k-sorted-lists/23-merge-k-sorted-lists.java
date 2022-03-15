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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists == null || lists.length == 0){
            return null;
        }
        
        ListNode dummyhead = new ListNode(-1);
        
        ListNode pointer = dummyhead;
        
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b) -> (a.val - b.val));
        
        for(ListNode node : lists){
            if(node!=null){
                minHeap.add(node);    
            }
            
        }
        
        while(!minHeap.isEmpty()){
            ListNode curr = minHeap.poll();
            pointer.next = curr;
            
            if(curr.next != null){
                minHeap.add(curr.next);
            }
            
            pointer = pointer.next;
            
        }
        
      return dummyhead.next;  
    }
}