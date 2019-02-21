//Dylan Mondro
public class LinkedListQueue <T>  {
	private class ListNode{
		private T data;
		private ListNode link;
	}
	private ListNode head;
	private ListNode tail;
	
	public LinkedListQueue() {
		this.head = null;
		this.tail = null;
	}
	
	public void enqueue(T aData) {
		ListNode newNode = new ListNode();
		newNode.data = aData;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		tail.link = newNode;
		tail = tail.link;
	}
	
	public T dequeue(){
		if(head == null) {
			System.out.println("Empty Queue");
			return null;
		}
		T ret = head.data;
		head = head.link;
		return ret;
	}
	
	public T peek() {
		return head.data;
	}
	
	public void Print() {
		ListNode position = head;
		System.out.println("\n");
		while(position != null) {
			System.out.print(position.data);
			position = position.link;
		}
		System.out.println("\n");
	}
}