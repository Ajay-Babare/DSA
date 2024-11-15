package heaps;

class MinHeap{
	private int [] arr;
	private int size;
	MinHeap(int capacity){
		arr = new int[capacity];
		size = 0;
	}
	public void add(int num) {
		if(size==arr.length)
			System.out.println("Heap is full");
		arr[size++] = num;
		upHeapify(size-1);
	}
	public void upHeapify(int idx) {
		if(idx == 0) return;
		int parent = (idx-1)/2;
		if(arr[idx]<arr[parent]) {
			swap(idx,parent);
			upHeapify(parent);
		}
	}
	public void swap(int a, int b) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public int peek() {
		if(size==0)
			System.out.println("Heap is Empty");
		return arr[0];
	}
	public int size() {
		return size;
	}
	public int remove()throws Exception{
		if(size == 0) throw new Exception("Heap is Empty");
		int peek =arr[0];
		swap(0,size-1);
		size--;
		downHeapify(0);
		return peek;
	}
	public void downHeapify(int i) {
		if(i>=size-1) return;
		int lc=2*i+1, rc=2*i+2;
		int minIdx = i;
		if(lc<size && arr[lc]<arr[minIdx]) minIdx = lc;
		if(rc<size && arr[rc]<arr[minIdx]) minIdx = rc;
		if(i==minIdx) return;
		swap(i,minIdx);
		downHeapify(minIdx);
	}
}
public class MinHeapImplimentationArray {

	public static void main(String[] args) throws Exception {
		MinHeap pq = new MinHeap(10);
		pq.add(3);
		System.out.println(pq);
		pq.add(2);
		System.out.println(pq.peek()+" "+pq.size());
		pq.add(1);
		System.out.println(pq.peek()+" "+pq.size());
		pq.remove();
		System.out.println(pq.peek()+" "+pq.size());
	}

}
