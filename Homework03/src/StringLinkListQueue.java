//Dylan Mondro
public class StringLinkListQueue <String>{
	private class ListNode{
		private String data;
		private ListNode link;
	}
	private ListNode head;
	private ListNode tail;
	
	private StringLinkListQueue() {
		this.head = null;
		this.tail = null;
	}
	
	public void enqueue(String aData) {
		ListNode newNode = new ListNode();
		newNode.data = aData;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		tail.link = newNode;
		tail = tail.link;
		}
	
	public String dequeue() {
		if(head == null) {
			System.out.println("Empty Queue");
			return null;
		}
		String ret = head.data;
		head = head.link;
		return ret;
	}
	
	public String peek() {
		return head.data;
	}
	
	public void Print() {
		ListNode position = head;
		System.out.println("\n");
		while(position != null) {
			System.out.print(position.data);
			position = position.link;
		}
		System.out.print("\n");
	}
}
