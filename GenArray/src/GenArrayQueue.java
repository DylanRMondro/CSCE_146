
public class GenArrayQueue <T> {
	public static final int SIZE = 100;
	
	private T[] queue;
	private int tailIndex;
	
	public GenArrayQueue() {
		queue = (T[]) new Object [SIZE];
		this.tailIndex = 0;
	}
	
	public GenArrayQueue(int aSize) {
		queue = (T[]) new Object [aSize];
		this.tailIndex = 0;
	}
	
	//add
	public void enqueue (T aData) {
		if(tailIndex >= queue.length) {
			System.out.println("Queue full");
			return;
		}
		else {
			queue[tailIndex] = aData;
			tailIndex ++;
		}
	}
	
	//remove
	public T dequeue() {
		T ret = queue[0];
		for(int i=0; i<queue.length-1; i++) {
			queue[i] = queue[i+1];
		}
		queue[queue.length-1]= null;
		tailIndex --;
		return ret;
	}
	
	public T peek(int aPlace) {
		return queue[aPlace];
	}
	
	//print
	public void print() {
		for(T node : queue) {
			if(node == null) {
				break;
			}
			else {
				System.out.println(node.toString());
			}
		}
	}
}
