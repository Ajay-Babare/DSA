//92. Reverse Linked List II
//Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
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
public class ReverseBetween {
//    public ListNode reverseList(ListNode head) {
//    if(head==null || head.next==null)
//        return head;
//    ListNode a=head.next;
//    ListNode newHead=reverseList(a);
//    a.next=head;
//    head.next=null;
//    return newHead;
//}
// public ListNode reverseBetween(ListNode head, int left, int right) {
//     ListNode a = null;
//     ListNode b = null;
//     ListNode c = null;
//     ListNode d = null;
//     int pos = 1;
//     ListNode temp = head;
//     while(temp!=null){
//         if(pos==left-1) a=temp;
//         if(pos==left) b=temp;
//         if(pos==right) c=temp;
//         if(pos==right+1) d=temp;
//         temp=temp.next;
//         pos++;
//     }
//     if(a!=null) a.next=null;
//     if(c!=null) c.next=null;
//     reverseList(b);
//     if(a!=null) a.next=c;
//     b.next=d;
//     if(a==null) return c;
//     return head;
// }
}
