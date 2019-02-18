//Dylan Mondro
public class GenLLQueue<t> {
	//This should work better than the arrary
	public class ListNode{
		private t data;
		private ListNode link;
	}
	private ListNode head;
	private ListNode tail;
	
	public GenLLQueue() {
		this.head = null;
		this.tail = null;
	}
	
	//add
	public void enqueue(t aData) {
		ListNode newNode = new ListNode();
		newNode.data = aData;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		tail.link = newNode;
		tail = tail.link;
	}
	
	//remover
	public t dequeue() {
		if(head == null) {
			System.out.print("Empty Queue");
			return null;
		}
		t retData = head.data;
		head = head.link;
		return retData;
	}
	
	//peek
	public t peek() {
		return head.data;
	}
	
	//print to console
	public void printQueue() {
		ListNode position = head;
		System.out.print("\n");
		while(position != null) {
			System.out.print(position.data+"\n");
			position = position.link;
		}
		System.out.println("\n");
	}
}
