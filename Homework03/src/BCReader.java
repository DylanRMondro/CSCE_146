import java.io.BufferedReader;
import java.io.FileReader;
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
				BufferedReader br = new BufferedReader(new FileReader(aFile));
				String line;
				while((line = br.readLine()) !=null) {
					LookABoard.createBoard(line);
				}
				br.close();
			}
			catch(Exception e) {
				System.out.println("Could not find the file with name: "+aFile);
				
			}
		}
		
		//read the command
		public void commandRead(String aFile) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(aFile));
				String line;
				while((line = br.readLine()) !=null) {
					Queue.enqueue(line);
				}		
				br.close();
			}
			catch(Exception e) {
				System.out.println("Could not find the file with name: "+aFile);
						
					}
				}
		public void startBoard() {
			LookABoard.printBoard();
		}
		
		public void doCommands() {
			while(Queue.peek() != null) {
				if(Queue.peek().equalsIgnoreCase(up)) {
					LookABoard.moveRobot(1);
					Queue.dequeue();
					LookABoard.printBoard();
					}
				
				if(Queue.peek().equalsIgnoreCase(right)) {
					LookABoard.moveRobot(2);
					Queue.dequeue();
					LookABoard.printBoard();
					}
				
				if(Queue.peek().equalsIgnoreCase(down)) {
					LookABoard.moveRobot(3);
					Queue.dequeue();
					LookABoard.printBoard();
					}
				
				if(Queue.peek().equalsIgnoreCase(left)) {
					LookABoard.moveRobot(4);
					Queue.dequeue();
					LookABoard.printBoard();
					}
				
				else {
					LookABoard.moveRobot(0);
					Queue.dequeue();
					LookABoard.printBoard();
				}
			}
		}

	}


