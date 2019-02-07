//Notes
public class GenLL <T>{
	private class ListNode{
		private T data;
		private ListNode link;
		public ListNode(T aData, ListNode aLink) {
			data = aData;
			link = aLink;
		}
	}
	private ListNode head; //points to first item
	private ListNode curr; // points to item of interest
	private ListNode prev; //one behind the current
	public GenLL() {
		head = curr = prev = null;
	}
	public T getCurrent() {
		if(curr != null)
			return curr.data;
		return null;
	}
	public void setCurrent(T aData) {//curr will point to the head
		if(curr != null)
			curr.data = aData;
	}
	public void goToNext() {
		if(curr == null)
			return;
		prev = curr;
		curr = curr.link;
	}
	public void resetCurr() { //points the curr to the head
		curr = head;
	}
	public boolean HasMore() {
		return curr != null; //if doesnt return null we have more // if it does return null than we dont have more
	}
	public void insert(T aData) {
		ListNode newNode = new ListNode(aData, null);
		if(head == null) {//will make a new node if there is not one already
			head = newNode;
			curr = head;
			return;
		}
		ListNode temp = head;
		while(temp.link != null) { //coping new data to links
			temp = temp.link;
		temp.link = newNode;
		}
	}
	public void insetAfterCurrent(T aData) {
		if(curr == null)
			return;
		ListNode newNode = new ListNode(aData, curr.link);
		curr.link = newNode;
	}
}
