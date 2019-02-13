//Dylan Mondro
public class ArrayCircQueue {
	private P[] queue;
	private int maxSize;//amount of players
	private int tailIndex;
	private int headIndez;
	public static final int DEF_SIZE = 2;
	public ArrayCircQueue() {
		init(size);
	}
	public void init(int size) {
		if(size <=1) {
			return;
		}
		tailIndex = headIndex = 0;
		queue = (P[])(new Object[size]);
	}
}
