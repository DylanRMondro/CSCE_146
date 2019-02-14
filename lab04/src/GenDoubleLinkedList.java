//Dylan Mondro
public class GenDoubleLinkedList<String> {
	private class ListNode{
		private String data;
		private ListNode link;
		public ListNode(String aData, ListNode aLink) {
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
	public void insert(String aData) {
		ListNode newNode = new ListNode(aData, null);
		if(head == null) {
			head = newNode;
			curr = head;
			return;
		}
		else if(curr.link == null) {
			curr.link = newNode;
			newNode = prev;
			curr = curr.link;
		}
	}
	public void insertNodeAfterCurrent(String aData) {
		if(curr == null) {
			return;
		}
		ListNode newNode = new ListNode(aData, curr.link);
		curr.link = newNode;
		newNode = prev;
		prev = curr.link;
	}
	public String getCurrent(){
		if(curr != null) {
			return curr.data;
		}
		else {
			return (String) "0";
		}
	}
	public void setCurrent(String aData) {
		if(curr != null) {
			curr.data = aData;
		}
	}
	public boolean hadMore() {
		return curr != null;
	}
	public void goToNext() {
		if(curr != null) {
			prev = curr;
			curr = curr.link;
		}
	}
	public void resetCurr() {
		curr = head;
	}
	public void goToPrev() {
		if(curr == null) {
			return;
		}
		curr = prev;
		curr = curr.link;
	}
	public void reserCurrent() {
		curr = head;
	}
	public void showList() {
		ListNode curr = head;
		while(curr.link != null) {
			System.out.println(curr.data);
		}
	}
	public void deleteCurrentNode() {
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
	public boolean inList(String aData) {
		return this.findNodeWith(aData) != null;
	}
	public void gotoTiem(String aData) {
		ListNode adata = this.findNodeWith(aData);
		if(adata == null) {
			return;
		}
		this.resetCurr();
		while(this.hadMore() && curr != adata	) {
			this.goToNext();
		}
	}
	public ListNode findNodeWith(String aData) {
		ListNode adata = head;
		while(adata != null) {
			if(adata.data.equals(aData)) {
				return adata;
			}
			adata = adata.link;
		}
		return null;
	}
}
