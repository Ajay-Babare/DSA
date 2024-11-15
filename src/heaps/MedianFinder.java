//295. Find Median from Data Stream
//The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.
//For example, for arr = [2,3,4], the median is 3.
//For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
//Implement the MedianFinder class:
//MedianFinder() initializes the MedianFinder object.
//void addNum(int num) adds the integer num from the data stream to the data structure.
//double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.
package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();	
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxHeap.size()==0) maxHeap.add(num);
        else {
        	if(num<maxHeap.peek()) maxHeap.add(num);
        	else minHeap.add(num);
        }
        //Balance the heaps
        if(maxHeap.size()==minHeap.size()+2) {
        	int top = maxHeap.remove();
        	minHeap.add(top);
        }
        if(minHeap.size()==maxHeap.size()+2) {
        	int top =minHeap.remove();
        	maxHeap.add(top);
        }
    }
    
    public double findMedian() {
        if(maxHeap.size()==minHeap.size())
        	return (maxHeap.peek()+minHeap.peek())/2.0;
        else if(maxHeap.size()>minHeap.size())
        	return maxHeap.peek();
        else return minHeap.peek();
    }
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */