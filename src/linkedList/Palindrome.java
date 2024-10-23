//234. Palindrome Linked List
//Given the head of a singly linked list, return true if it is a 
//palindrome or false otherwise.

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
public class Palindrome {
	
//    public ListNode reverseList(ListNode head) {
//    ListNode curr=head;
//    ListNode prev=null;
//    ListNode Next=head; // head/null
//    while(curr!=null){
//        Next=curr.next;
//        curr.next=prev;
//        prev=curr;
//        curr=Next;
//    }
//    return prev;
//}
// public boolean isPalindrome(ListNode head) {
//     //middle Node
//     ListNode slow = head;
//     ListNode fast = head;
//     while(fast!=null && fast.next != null){
//         slow = slow.next;
//         fast = fast.next.next;
//     }
//     //Reverse LinkedList
//     ListNode j = reverseList(slow);
//     ListNode i = head;
//     //check palindrome 
//     while(j!=null){
//         if(i.val!=j.val)
//             return false;
//         i=i.next;
//         j=j.next;
//     }
//     return true;
// }
 
}
