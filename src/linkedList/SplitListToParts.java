//725. Split Linked List in Parts
//Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
//The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.
//The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.
//Return an array of the k parts.
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
public class SplitListToParts {
//	   public static int lengthOfList(ListNode head){
//	        ListNode temp=head;
//	        int length=0;
//	        while(temp!=null){
//	            temp=temp.next;
//	            length++;
//	        }
//	        return length;
//	    }
//	    public ListNode[] splitListToParts(ListNode head, int k) {
//	        int n = lengthOfList(head);
//	        int size=n/k; // n/k +1
//	        int extra=n%k;
//	        ListNode[] arr = new ListNode[k];
//	        int idx=0;
//	        ListNode temp = head;
//	        int len = 1;
//	        while(temp!=null){
//	            int s=size;
//	            if(extra>0) s++;
//	            if(len==1) arr[idx++]=temp;
//	            if(len==s){
//	                ListNode a =temp.next;
//	                temp.next=null;
//	                temp=a;
//	                len=1;
//	                extra--;
//	            }
//	            else{
//	                len++;
//	                temp=temp.next;
//	            }
//	        }
//	        return arr;
//	    }
}
