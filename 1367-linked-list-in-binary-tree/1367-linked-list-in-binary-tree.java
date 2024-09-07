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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public boolean isSubPath(ListNode head, TreeNode root) 
    {
        return isSubPathHelper(head, head, root);
    }

    public boolean isSubPathHelper(ListNode head, ListNode tracker,TreeNode root) //DFS algorithm
    {
        if(tracker==null)
        {
            return true;  //ends the path of the tree
        }
        if(root==null)
        {
            return false; //tree ends here so return null because there is no number
        }

        if(tracker.val == root.val)
        { 
        tracker = tracker.next;
        }
        else if(head.val==root.val)
        {
            head = head.next;
        }   
        else
        {
            tracker = head;
        }

       return isSubPathHelper(head,tracker,root.left) || isSubPathHelper(head,tracker,root.right); //checks both paths of the tree
    }
}