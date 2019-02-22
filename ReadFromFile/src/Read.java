import java.io.BufferedReader;
import java.io.FileReader;

//this is an example 
public class Read {
	private static String aFile = "File name";
	public void reader() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(aFile));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		
		catch(Exception e) {
			System.out.println("Could not find the file!");
		}
	}
	
}
