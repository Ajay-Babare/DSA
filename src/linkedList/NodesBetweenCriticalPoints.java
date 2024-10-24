//2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
//A critical point in a linked list is defined as either a local maxima or a local minima.
//A node is a local maxima if the current node has a value strictly greater than the previous node and the next node.
//A node is a local minima if the current node has a value strictly smaller than the previous node and the next node.
//Note that a node can only be a local maxima/minima if there exists both a previous node and a next node.
//Given a linked list head, return an array of length 2 containing [minDistance, maxDistance] where minDistance is the minimum distance between any two distinct critical points and maxDistance is the maximum distance between any two distinct critical points. If there are fewer than two critical points, return [-1, -1]. 
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
public class NodesBetweenCriticalPoints {
//    public int[] nodesBetweenCriticalPoints(ListNode head) {
//        ListNode left = head;
//        ListNode mid = head.next;
//        ListNode right = head.next.next;
//        int first=-1;
//        int last=-1;
//        int idx=1;
//        int[] arr= {-1,-1};
//        int minDistance=Integer.MAX_VALUE;
//        while(right!=null){
//            if(mid.val<left.val && mid.val<right.val || mid.val>left.val && mid.val>right.val){
//                if(first==-1) first = idx;
//                if(last!=-1){
//                    int dist = idx-last;
//                    minDistance=Math.min(minDistance,dist);
//                }
//                last=idx;
//            }
//            idx++;
//            left = left.next;
//            mid = mid.next;
//            right = right.next;
//        }
//        if(first==last) return arr;
//        int maxDistance=last-first;
//        arr[0]=minDistance;
//        arr[1]=maxDistance;
//        return arr;
//    }
}
