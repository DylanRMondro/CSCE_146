//Dylan Mondro
public class ArrayCircQueue <T> {
	private T[] queue;
	private int tailIndex;
	//private int headIndex;
	public static final int DEF_SIZE = 2;
	
	//intitalize the queue
	public ArrayCircQueue() {
		queue = (T[]) new Object [DEF_SIZE];
		this.tailIndex = 0;
	}
	public ArrayCircQueue(int aSize) {// aSize is the amount of players in the game
		queue = (T[]) new Object[aSize];
		this.tailIndex = 0;
	}
	
	//add to queue
	public T enqueue (T aData) { // Will get the name and if the are in the game
		if(tailIndex >= queue.length) { //if the queue is full
			System.out.println("Player list is full");
			return aData;
		}
		else { // this will add the player to the queue
			queue[tailIndex] = aData;
			tailIndex ++;
		}
		return aData;
	}
	
	//this will remove the player if they guess to high of a number
	public T dequeue() {
		T ret = queue[0];
		for(int i=0; i<queue.length-1; i++) {
			queue[i] = queue[i+1];
		}
		queue[queue.length-1] = null;
		tailIndex --;
		return ret;
	}
	
	//used to see a player line
	public T peek(int aData) {
		return queue[aData];
	}
	
	//print
	public void showQueeu() {
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
