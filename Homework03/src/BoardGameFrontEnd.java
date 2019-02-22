import java.util.Scanner;
//Dylan Mondro
public class BoardGameFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Robot Simulator");
		int isOne = 1;
		while(isOne == 1) {
			BCReader reader = new BCReader();
			//String buffer = sc.nextLine();
			System.out.println("Enter the file for the Board. Please enter .txt after!");
			String newBoard = sc.nextLine();
			reader.boardReader(newBoard);
			System.out.println("Enter the file for the Commands. Please enter .txt after!");
			String NewCommands = sc.nextLine();
			reader.commandRead(NewCommands);
			reader.startBoard();
			reader.doCommands();
			System.out.println("Do you with to continue? Enter true to quit");
			String isTrue = sc.nextLine();
			if(isTrue.equalsIgnoreCase("false")) {
				isOne = 0;
			}
			else {
				isOne = 1;
			}
			}
		}

}
