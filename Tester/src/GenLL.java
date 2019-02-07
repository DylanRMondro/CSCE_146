
public class GenLL <T>{ //Generic type T
	private class ListNode{//internal class
		private T data;
		private ListNode link;
		public ListNode(T aData, ListNode aLink) {
			data = aData;
			link = aLink;
		}
	}
	private ListNode head; //Point to the fisrt item in the list
	private ListNode curr; //Current node of interest
	private ListNode prev; //One node behind current
		public GenLL() {
			head = curr = prev = null;
		}
		public void insert(T aData) {//Inserts at the end of the list
			ListNode newNode = new ListNode(aData, null);
			if(head == null) { // If nothing then the list is empty
				head = newNode;
				curr = head; // curr = newNode;
				return;
			}
			ListNode temp = head;
			while(temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode; //Point at the end
		}
		public void print() {
			for(ListNode temp = head; temp != null; temp = temp.link) {
				System.out.println(temp.data);
			}
			System.out.println();	
		}
		public T getCurrent() {
			if(curr == null) {
				return curr.data;
			}
			return null;
		}
		public void setCurrent(T aData) {
			if(curr.data != aData) {
				curr.data = aData;
			}
		}
		public void gotoNext() {
			if(curr== null) {
				prev = curr;
				curr = curr.link;
			}
		}
		public void reset() {
			prev = null;
			curr = head;
		}
		public void insertAfterCurrent(T aData) {
			if(curr == null) {
				return;
			}
			ListNode newNode = new ListNode(aData, curr.link);
			curr.link = newNode;
		}
		public void deleteCurrent() {
			if(curr != null && prev != null) { //Current is not at head
				prev.link = curr.link;
				curr = curr.link;
			}
			else if(curr != null && prev == null) { //Current is at the head
				head = head.link; // curr = curr.link;
			}
		}
		public boolean isContained(T aData) {
			return search(aData) != null;
		}
		private ListNode search(T aData) {
			ListNode temp = head;
			while(temp != null) {
				if(temp.data.equals(aData)) {
					return temp;
				}
				temp = temp.link;
			}
			return null;
		}
}

