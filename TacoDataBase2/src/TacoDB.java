//notes
import java.util.*;
import java.io.*;
public class TacoDB {
	private GenLL<Taco> tacos;
	public static final String DELM = "\t";
	public TacoDB() {
		tacos = new GenLL<Taco>(); //created the LinkList taco
	}
	public void addTaco(Taco aTaco) { //will add the object taco
		tacos.insert(aTaco);
	}
	public void removeTaco(Taco aTaco) { //will remove the current taco
		tacos.gotoItem(aTaco);
		tacos.deletCurrent();
	}
}
