//Dylan Mondro
public class Board {
	private int DEFF_SIZE = 10; //the board will be 10 X 10
	private int START_COR = 0; //Starting coordinate
	public int rowCord = START_COR;//keep track of robot's row coordinate
	public int colCord = START_COR;//Keep track of robot's column coordinate
	String [] [] theBoard = new String[DEFF_SIZE][DEFF_SIZE];
	
	//will insert the information into the array
	public void createBoard(String aData) { 
		for(int i=0; i<theBoard.length; i++) { //row
			for(int j=0; i<theBoard[i].length; j++) { //col
				theBoard[i][j] = aData;
			}
		}
	}
	
	//insert the robot at 0,0
	public void insertRobot() {
		theBoard[START_COR][START_COR] = "O";
	}
	/*
	 * 0 = no move
	 * 1 = move up
	 * 2 = move right
	 * 3 = move down
	 * 4 = move left
	 */
	public void moveRobot(int aMove) {
		int pastRowCord = rowCord; //keep track of current row cord
		int pastColCord = colCord; //keep track of current column cord
		if((aMove == 0) || (aMove == 1) || (aMove == 2) || (aMove == 3) || (aMove == 4)) {
			int futureRowCord = 0;
			int futureColCord = 0;
			//how the robot will move
			switch(aMove) {
			
			//will set the robot back to its original cord
			case 0:
				System.out.println("Can't move");
				break;
			
			//will move the robot up
			case 1:
				if(theBoard[rowCord][colCord +1].equalsIgnoreCase("X")) {
					System.out.println("Crash");
				}
				else {
					futureColCord ++;
				}
				break;
			
			//will move the robot right
			case 2:
				if(theBoard[rowCord +1][colCord].equalsIgnoreCase("X")) {
					System.out.println("Crash");
				}
				else {
					futureRowCord++;
				}
				break;
				
			//will move the robot down
			case 3:
				if(theBoard[rowCord][colCord -1].equalsIgnoreCase("X")) {
					System.out.println("Crash");
				}
				else {
					futureColCord --;
				}
				break;
				
			//will move the robot left
			case 4:
				if(theBoard[rowCord -1][colCord].equalsIgnoreCase("X")) {
					System.out.println("Crash");
				}
				else {
					futureRowCord --;
				}
				break;
			}//end of switch
			
			theBoard[futureRowCord][futureColCord] = "O";//add the robot to the new coordinate
			theBoard[pastRowCord][pastColCord] = "_";//will remove the robot from the past coordinate
		}
	}
	
	//will print the board
	public void printBoard() {
		for(int i=0; i<theBoard.length; i++) { //row
			for(int j=0; i<theBoard[i].length; j++) { //col
				System.out.print(theBoard[i][j]);
			}
		}
	}
}
