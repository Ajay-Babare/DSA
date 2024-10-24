//430. Flatten a Multilevel Doubly Linked List
//You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer, and an additional child pointer. This child pointer may or may not point to a separate doubly linked list, also containing these special nodes. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure as shown in the example below.
//Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level, doubly linked list. Let curr be a node with a child list. The nodes in the child list should appear after curr and before curr.next in the flattened list.
//Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null.
package linkedList;
/*
//Definition for a Node.
class Node {
 public int val;
 public Node prev;
 public Node next;
 public Node child;
};
*/
public class Flatten {
//    public Node flatten(Node head) {
//        Node temp = head;
//        while(temp!=null){
//            Node n = temp.next;
//            if(temp.child!=null){
//                Node c = flatten(temp.child); //recursion
//                Node d = c;
//                while(d.next!=null) 
//                d = d.next;
//                temp.next=c;
//                c.prev=temp;
//                d.next=n;
//                if(n!=null)
//                    n.prev=d;
//                temp.child=null;//Important
//            }
//            temp=n;
//        }
//        return head;
//    }
}
