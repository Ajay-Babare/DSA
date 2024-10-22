//19. Remove Nth Node From End of List
//Given the head of a linked list, remove the nth node from the end of the list and return its head.
package linkedList;

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
public class RemoveNthFromEnd {

	
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode slow = head;
//        ListNode fast = head;
//        //move n steps ahead
//        for(int i=1;i<=n;i++){
//            fast=fast.next;
//        }
//        if(fast==null)
//            //delete the head
//            return head.next;
//        //move slow & fast togesther till tail
//        while(fast.next!=null){
//            slow=slow.next;
//            fast=fast.next;
//        }
//        slow.next =slow.next.next;
//        return head;
//    }
	
}
