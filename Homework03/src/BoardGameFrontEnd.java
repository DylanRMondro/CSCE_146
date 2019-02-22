import java.util.Scanner;
//Dylan Mondro
public class BoardGameFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean isOne = true;
		while(isOne == true) {
			BCReader reader = new BCReader();
			String buffer = sc.nextLine();
			System.out.println("Welcome to the Robot Simulator\nEnter the file for the Board");
			String newBoard = sc.nextLine();
			reader.boardReader(newBoard);
			System.out.println("Enter the file for the Commands");
			String NewCommands = sc.nextLine();
			reader.commandRead(NewCommands);
			reader.startBoard();
			reader.doCommands();
			System.out.println("Do you with to continue? Enter true to quit");
			String isTrue = sc.nextLine();
			if(isTrue.equalsIgnoreCase("false")) {
				isOne = false;
			}
			else {
				isOne = true;
			}
			}
		}

}
