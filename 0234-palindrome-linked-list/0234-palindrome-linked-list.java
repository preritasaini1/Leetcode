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
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
            ListNode middle=middle(head);
            ListNode secondrev=reverse(middle.next);
            if(head==null || head.next==null){
                return true;
            }
            ListNode firsth=head;
            while(secondrev!=null){
                if(firsth.val!=secondrev.val){
                    return false;
                }
                firsth=firsth.next;
                secondrev=secondrev.next;
            }
            return true;
    }
}