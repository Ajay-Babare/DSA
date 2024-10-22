//160. Intersection of Two Linked Lists
//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
//For example, the following two linked lists begin to intersect at node c1:
//The test cases are generated such that there are no cycles anywhere in the entire linked structure.
//Note that the linked lists must retain their original structure after the function returns.
//Custom Judge:
//The inputs to the judge are given as follows (your program is not given these inputs):
//intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
//listA - The first linked list.
//listB - The second linked list.
//skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
//skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
//The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.
package linkedList;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class GetIntersectionNode {

	
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//
//        int lenA=0;
//        ListNode tempA=headA;
//        while(tempA!=null){
//            tempA=tempA.next;
//            lenA++;
//        }
//        int lenB=0;
//        ListNode tempB=headB;
//        while(tempB!=null){
//            tempB=tempB.next;
//            lenB++;
//        }
//        tempA=headA;
//        tempB=headB;
//        if(lenA>lenB){
//            for(int i=1;i<=lenA-lenB;i++){
//                tempA=tempA.next;
//            }
//        }
//        else{//lenB>=lenA
//            for(int i=1;i<=lenB-lenA;i++){
//                tempB=tempB.next;
//            }
//        }
//        while(tempA!=tempB){
//            tempA=tempA.next;
//            tempB=tempB.next;
//        }
//        return tempA;
//    }
	
}
