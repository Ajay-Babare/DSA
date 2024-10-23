//61. Rotate List
//Given the head of a linked list, rotate the list to the right by k places.
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
public class RotateRight {
//    public ListNode rotateRight(ListNode head, int k) {
//        if(head==null || head.next==null)
//            return head;
//        ListNode temp=head;
//        int n=0;
//        while(temp!=null){
//            temp=temp.next;
//            n++;
//        }
//        k%=n;
//        if(k==0)
//            return head;
//        ListNode slow=head;
//        ListNode fast=head;
//        for(int i=1;i<=k;i++){
//            fast=fast.next;
//        }
//        while(fast.next!=null){//fast will at tail
//            slow=slow.next;
//            fast=fast.next;
//        }
//        ListNode newhead = slow.next;
//        slow.next=null;//slow is now the new tail
//        fast.next=head;
//        return newhead;
//    }
}
