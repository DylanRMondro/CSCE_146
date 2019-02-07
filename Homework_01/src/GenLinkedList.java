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
}
