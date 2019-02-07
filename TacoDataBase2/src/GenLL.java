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
}
