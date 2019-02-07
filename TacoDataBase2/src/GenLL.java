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
		if(curr == null) //if there is no before curr return null
			return;
		ListNode newNode = new ListNode(aData, curr.link);
		curr.link = newNode;
	}
	public void deletCurrent() {
		if(curr != null && prev != null) { //none are pointing to the head
			prev.link = curr.link; 
			curr = curr.link; //what was at curr is now lost
		}
		else if(curr != null) {
			head = head.link; // cutting off the head
		}
	}
	public void print() {//print all data
		ListNode temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	public boolean isContained(T aData) {// will look for any data with that structure
		return this.findNodeWith(aData) != null;
	}
	public void gotoItem(T aData) { //will point the pointer to the data
		ListNode temp = this.findNodeWith(aData);
		if(temp == null) 
			return;
		this.resetCurr();
		while(this.HasMore() && curr != temp)//will move the node
			this.goToNext();
	}
	private ListNode findNodeWith(T aData) {//this will find the data for the isContained
		ListNode temp = head;
		while(temp != null) {
			if(temp.data.equals(aData))
				return temp;
			temp = temp.link;
		}
		return null;
	}
}
