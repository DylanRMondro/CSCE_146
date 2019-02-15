//Dylan Mondro
import java.util.Scanner;
import java.util.Random;
public class HotPotatoFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		Random ran = new Random(170+10); 
		Boolean t = true;// will automaticaly set the players inGmae to true
		System.out.println("Welcome to the Hot potato game\n How many players will be in this game?");
		int aPlayer = key.nextInt(); //amount of players in the game;
		
		//adding players to the queue
		ArrayCircQueue ay = new ArrayCircQueue(aPlayer);
		for(int i=0; i<aPlayer; i++) {
			System.out.println("Enter the palyer" + i + "name");
			String aName = key.nextLine();
			Player py = new Player(aName, t);
			py = ay.enqueue(py.getName());
		}
	}

}
