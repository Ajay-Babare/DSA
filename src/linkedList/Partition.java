//86. Partition List
//Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//You should preserve the original relative order of the nodes in each of the two partitions.
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
public class Partition {
//    public ListNode partition(ListNode head, int x) {
//        ListNode a = new ListNode(-1);
//        ListNode b = new ListNode(-1);
//        ListNode tempA = a;
//        ListNode tempB = b;
//        ListNode temp = head;
//        while(temp!=null){
//            if(temp.val<x){
//                tempA.next=temp;
//                tempA=tempA.next;
//            }
//            else{ //temp.val>=x
//                tempB.next=temp;
//                tempB=tempB.next;
//            }
//            temp=temp.next;
//        }
//        tempB.next=null;//last node
//        a=a.next;
//        b=b.next;
//        if(a==null) //Important
//            return b;
//        tempA.next=b; //list a attached to b
//        return a;
//    }
}
