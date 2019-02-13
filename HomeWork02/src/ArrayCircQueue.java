//Dylan Mondro
public class ArrayCircQueue {
	private T[] queue;
	private int maxSize;//amount of players
	private int tailIndex;
	private int headIndex;
	public static final int DEF_SIZE = 2;
	public ArrayCircQueue() {
		init(DEF_SIZE);
	}
	public void init(int size) {
		if(size <=1) {
			return;
		}
		tailIndex = headIndex = 0;
		queue = (P[])(new Object[size]);
	}
}
