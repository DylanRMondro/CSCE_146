import java.io.File;
import java.util.Scanner;
//Dylan Mondro
public class BCReader {
	//Will read the board.txt and robotCommands.txt
	private int START_COR = 0; //Starting coordinate
	private StringLinkListQueue <String> Queue; //creates the command queue
	private Board LookABoard = new Board();
	
	//These are lines from commands.txt
	private String up = "Move Up";
	private String right = "Move Right";
	private String down = "Move Down";
	private String left = "Move Left";
	
	//read the board
	public void boardReader(String aFile) {
		try {
			File file = new File(aFile);
			Scanner fileScanner = new Scanner(file);
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				LookABoard.createBoard(fileScanner.nextLine());
			}
		}
		catch(Exception e) {
			System.out.println("Could not find the file with name: "+aFile);
			
		}
	}
	
	//read the command
	public void commandRead(String aFile) {
		try {
			File file = new File(aFile);
			Scanner fileScanner = new Scanner(file);
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				Queue.enqueue(fileScanner.nextLine());
			}
		}
		catch(Exception e) {
			System.out.println("Could not find the file with name: "+aFile);
					
				}
			}
	
	public void doCommands() {
		if(Queue.peek().equalsIgnoreCase(up)) {
			LookABoard.moveRobot(1);
			Queue.dequeue();
			}
		
		if(Queue.peek().equalsIgnoreCase(right)) {
			LookABoard.moveRobot(2);
			Queue.dequeue();
			}
		
		if(Queue.peek().equalsIgnoreCase(down)) {
			LookABoard.moveRobot(3);
			Queue.dequeue();
			}
		
		if(Queue.peek().equalsIgnoreCase(left)) {
			LookABoard.moveRobot(4);
			Queue.dequeue();
			}
		
		else {
			LookABoard.moveRobot(0);
			Queue.dequeue();
		}
	}
}
