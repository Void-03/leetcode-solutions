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
class Solution 
{
    public ListNode modifiedList(int[] nums, ListNode head) 
    { 
        ListNode dummy = new ListNode(); 
        ListNode tracker = dummy;
        HashSet<Integer> hashset =  new HashSet<>();
        
        for(int i:nums)
        {
            hashset.add(i);
        }

        while(head!=null)
        {
            if(!hashset.contains(head.val))//checks if the hash doesnt have the linked lists values
            {   
                tracker.next = head;  //checks current node
                tracker = tracker.next; //moves to the next node
            }
            head = head.next;//moves to next node

        }  
        tracker.next = null; // reset tracker to null every interation to avoid repeating a cycle
        return dummy.next;//starts linked list from the next node.
    }
}