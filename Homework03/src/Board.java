//Dylan Mondro
public class Board {
	private int DEFF_SIZE = 10; //the board will be 10 X 10
	private int START_COR = 0; //Starting coordinate
	char [] [] theBoard = new char[DEFF_SIZE][DEFF_SIZE];
	
	//will insert the information into the array
	public void createBoard(char aData) { 
		for(int i=0; i<theBoard.length; i++) { //row
			for(int j=0; i<theBoard[i].length; j++) { //col
				theBoard[i][j] = aData;
			}
		}
	}
	
	//insert the robot at 0,0
	public void insertRobot() {
		theBoard[START_COR][START_COR] = 'O';
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
