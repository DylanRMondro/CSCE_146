//Dylan Mondro
public class GenLinkedList <M>{
	private class ListNode{
		private M data;
		private ListNode link;
		public ListNode(M aData, ListNode aLink) {
			data = aData;
			link = aLink;
		}
	}
	private ListNode head; //points to the first item in list
	private ListNode curr; //point to the current node of interest
	private ListNode prev; //One node behind current
	public GenLinkedList() {
		head = curr = prev = null;
	}
	public M getCurrent() {
		if(curr != null)
			return curr.data;
		return null;
	}
	public void setCurrent(M aData) {
		if(curr != null)
			curr.data = aData;
	}
	public void goToNext() {
		if(curr == null)
			return;
		prev = curr;
		curr = curr.link;
	}
	public void resetCurr() {
		curr = head;
	}
	public boolean hasMore() {
		return curr != null;
	}
	public void insert(M aData) {
		ListNode newNode = new ListNode(aData, null);
		if(head == null) {
			head = newNode;
			curr = head;
			return;
		}
		ListNode temp = head;
		while(temp.link != null) {
			temp = temp.link;
		temp.link = newNode;
		}
	}
	public void inserAfterCurrent(M aData) {
		if(curr == null)
			return;
		ListNode newNode = new ListNode(aData, curr.link);
		curr.link = newNode;
	}
	public void deleCurrent() {
		if(curr != null && prev != null) {
			prev.link = curr.link;
			curr = curr.link;
		}
		else if(curr != null) {
			head = head.link;
		}
	}
}
