
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenLL<Integer> iLL;
		iLL = new GenLL<Integer>();
		for(int i=0; i<10; i++) {
			iLL.insert(i);
		}
		iLL.print();
		
		iLL.gotoNext();
		iLL.gotoNext();
		iLL.gotoNext();
		iLL.setCurrent(235);
		iLL.print();
		
		iLL.gotoNext();
		iLL.deleteCurrent();
		iLL.print();
		
		GenLL<String> strLL = new GenLL<String>();
		//for(int i=0; )
		
	}

}
