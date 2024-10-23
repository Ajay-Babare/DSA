//21. Merge Two Sorted Lists
//You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//Return the head of the merged linked list.
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
public class MergeTwoLists {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummy = new ListNode(-1);
//        ListNode temp=dummy;
//        ListNode temp1=list1;
//        ListNode temp2=list2;
//        while(temp1!=null && temp2!=null){
//            if(temp1.val<=temp2.val){
//                temp.next=temp1;
//                temp1=temp1.next;
//            }
//            else{
//                temp.next=temp2;
//                temp2=temp2.next;
//            }
//            temp=temp.next;
//        }
//        if(temp1==null)
//            temp.next=temp2;
//        else
//            temp.next=temp1;
//        return dummy.next;
//    }
}
