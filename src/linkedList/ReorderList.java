//143. Reorder List
//You are given the head of a singly linked-list. The list can be represented as:
//L0 → L1 → … → Ln - 1 → Ln
//Reorder the list to be on the following form:
//L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//You may not modify the values in the list's nodes. Only nodes themselves may be changed.
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
public class ReorderList {
//    public ListNode middleNode(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//        while(fast!=null && fast.next != null){
//           slow = slow.next;
//           fast= fast.next.next;
//        } 
//       return slow;
//    }
//    public ListNode reverseList(ListNode head) {
//       ListNode curr=head;
//       ListNode prev=null;
//       ListNode Next=head; // head/null
//       while(curr!=null){
//           Next=curr.next;
//           curr.next=prev;
//           prev=curr;
//           curr=Next;
//       }
//       return prev;
//    }
//    public void reorderList(ListNode head) {
//        ListNode leftMiddle= middleNode(head);
//        ListNode head2 = leftMiddle.next;
//        leftMiddle.next=null;
//        head2 = reverseList(head2);
//        ListNode dummy = new ListNode(-1);
//        ListNode temp = dummy;
//        while(head!=null && head2!=null){
//            temp.next=head;
//            head=head.next;
//            temp=temp.next;
//            temp.next=head2;
//            head2=head2.next;
//            temp=temp.next;
//        }
//        if(head==null) temp.next=head2;
//        if(head2==null) temp.next=head;
//        head= dummy.next;
//    }
}
