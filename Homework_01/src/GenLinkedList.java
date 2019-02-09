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
	public void goToPast() {
		if(curr == null)
			return;
		curr = prev;
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
			else if(curr == null) {
				System.out.println("No movie found");
			}
	}
	public void print() {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data);
			temp = temp.link;
		}
	}
	public boolean isContained(M aData) {
		return this.findNodeWith(aData) != null;
	}
	public void gotoItem(M aData) {
		ListNode temp = this.findNodeWith(aData);
		if(temp == null)
			return;
		this.resetCurr();
		while(this.hasMore() && curr != temp)
			this.goToNext();
	}
	public ListNode findNodeWith(M aData) {
		ListNode temp = head;
		while(temp != null) {
			if(temp.data.equals(aData))
				return temp;
			temp = temp.link;
		}
		return null;
	}
}
