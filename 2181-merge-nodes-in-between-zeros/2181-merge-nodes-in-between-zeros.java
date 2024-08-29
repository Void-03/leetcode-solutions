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
    public ListNode mergeNodes(ListNode head) 
    {
        ListNode node = head.next;
        ListNode current = head.next;

        while(node!=null)
        {
            int sum = 0;
            while(node.val != 0 )
            {
                sum += node.val;
                node = node.next;
            }
            node = node.next;
            current.val = sum;
            current.next = node;
            current = node;

        }
        return head.next;
    }
}