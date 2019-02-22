import java.io.File;
import java.util.Scanner;
//Dylan Mondro
public class BCReader {
	//Will read the board.txt and robotCommands.txt
	private int START_COR = 0; //Starting coordinate
	private StringLinkListQueue <String> Queue; //creates the command queue
	private Board LookABoard = new Board();
	private final static String DELIMITER = ",";
	
	//read the board
	public void boardReader(String aFile) {
		try {
			File file = new File(aFile);
			Scanner fileScanner = new Scanner(file);
			while(fileScanner.hasNext()) {
				String line = fileScanner.nextLine();
				LookABoard.createBoard(fileScanner.nextLine());
			}
		}
		catch(Exception e) {
			System.out.println("Could not find the file with name"+aFile);
			
		}
	}
	
	//read the command
	public void commandRead(String aFile) {
		try {
					
				}
		catch(Exception e) {
			System.out.println("Could not find the file with name"+aFile);
					
				}
			}
}
