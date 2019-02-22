import java.io.File;
import java.util.Scanner;

//this is an example 
public class Read {
 
	private GenLL<Taco> tacos;
	public static final String DELM = "\t";
	
	public TacoDB() {
		tacos = new GenLL<Taco>(); //created the LinkList taco
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
