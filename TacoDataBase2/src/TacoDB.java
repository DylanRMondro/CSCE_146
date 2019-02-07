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
	public void readFromFile(String fileName) {
		try {
			Scanner fileScanner = new Scanner(new File(fileName));
			while(fileScanner.hasNextLine()) {
				String fileLine = fileScanner.nextLine();
				String[] splitLine = fileLine.split(DELM);
				if(splitLine.length != 4)
					continue;
				this.addTaco(new Taco(splitLine[0],
						splitLine[1],
						Double.parseDouble(splitLine[2]),
						Integer.parseInt(splitLine[3])));
			}
			fileScanner.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
