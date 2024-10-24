//2. Add Two Numbers
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself. 
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
public class AddTwoNumbers {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode(-1);
//        ListNode temp = dummy;
//        int carry = 0;
//        while(l1!=null || l2!=null){
//            int val1=0;
//            int val2=0;
//            if(l1 != null) val1=l1.val;
//            if(l2 != null) val2=l2.val;
//            int num = val1+val2+carry;
//            ListNode node = new ListNode(num%10);
//            temp.next=node;
//            temp=temp.next;
//            if(num>9) carry=1;
//            else carry=0;
//            if(l1 != null)l1=l1.next;
//            if(l2 != null)l2=l2.next;
//        }
//        if(carry==1){
//            ListNode node = new ListNode(1);
//            temp.next=node;
//            temp=temp.next;
//        }
//        return dummy.next;
//    }
}
