//Dylan Mondro
public class ArrayCircQueue <Player> {
	private Player[] queue;
	private int tailIndex;
	//private int headIndex;
	public static final int DEF_SIZE = 2;
	
	//intitalize the queue
	public ArrayCircQueue() {
		queue = (Player[]) new Object [DEF_SIZE];
		this.tailIndex = 0;
	}
	public ArrayCircQueue(int aSize) {// aSize is the amount of players in the game
		queue = (Player[]) new Object[aSize];
		this.tailIndex = 0;
	}
	
	//add to queue
	public Player enqueue (Player aData, Boolean aTrue) { // Will get the name and if the are in the game
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
	public Player dequeue() {
		Player ret = queue[0];
		for(int i=0; i<queue.length-1; i++) {
			queue[i] = queue[i+1];
		}
		queue[queue.length-1] = null;
		tailIndex --;
		return ret;
	}
	
	//used to see the first line
	public Player peek() {
		return queue[0];
	}
	
	//print
	public void showQueeu() {
		for(Player node : queue) {
			if(node == null) {
				break;
			}
			else {
				System.out.println();
			}
		}
	}
}
