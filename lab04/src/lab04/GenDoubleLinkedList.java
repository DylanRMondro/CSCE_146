//Dylan Mondro
public class GenDoubleLinkedList {
	private class ListNode{
		private int data;
		private ListNode link;
		public ListNode(int aData, ListNode aLink) {
			data = aData;
			link = aLink;
		}
	}
	private ListNode head;
	private ListNode curr;
	private ListNode prev;
	public GenDoubleLinkedList() {
		head = curr = prev = null;
	}
	public void insert(int aData) {
		ListNode newNode = new ListNode(aData, null);
		if(head ==null) {
			head = newNode;
			curr = head;
			return;
		}
		ListNode temp = head;
		while(temp.link != null) {
			temp = temp.link;
		}
		temp.link = newNode;
	}
	public void inserAfterCurrent(int aData) {
		if(curr == null) {
			return;
		}
		ListNode newNode = new ListNode(aData, curr.link);
		curr.link = newNode;
	}
	public int getCurrent(){
		if(curr != null) {
			return curr.data;
		}
		else {
			return 0;
		}
	}
	public void setCurrent(int aData) {
		if(curr != null) {
			curr.data = aData;
		}
	}
	public void moveCurrentForward() {
		if(curr != null) {
			prev = curr;
			curr = curr.link;
		}
	}
	public void reserCurrent() {
		curr = head;
	}
	public void showList() {
		ListNode temp = head;
		while(temp != null) {
			System.out.println(temp);
			temp = temp.link;
		}
	}
	public void deleteCurrent() {
		if(curr != null && prev != null) {
			prev.link = curr.link;
			curr = curr.link;
		}
		else if(curr != null && prev == null) {
			head = head.link;
		}
		else {
			System.out.println("Nope");
		}
	}
}
