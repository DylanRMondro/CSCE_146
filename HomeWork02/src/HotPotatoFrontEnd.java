//Dylan Mondro
import java.util.Scanner;
import java.util.Random;
public class HotPotatoFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		Random ran = new Random(); 
		Boolean t = true;// will automaticaly set the players inGmae to true
		int inGame = 1; // 1 is start 0 is stop
		
		System.out.println("Welcome to the Hot potato game\nHow many players will be in this game?");
		int aPlayer = key.nextInt(); //amount of players in the game;
			
			//adding players to the queue
			ArrayCircQueue ay = new ArrayCircQueue(aPlayer);
			String buffer = key.nextLine();
			for(int i=0; i<aPlayer; i++) {
				System.out.println("Enter the palyer" + (i+1) + " name");
				String aName = key.nextLine();
				Player py = new Player(aName);
				ay.enqueue(py.getName()); //player will be added to the queue
			}
		
		while(inGame == 1) {	
			System.out.println("Lets begain");
			int randomInt = ran.nextInt(50);//will crate a random time for the potato
			Potato p = new Potato(randomInt);// created the hot potato
				//while loop for the guessing
				while(p.badPotato()== true) {
					System.out.println("Guess the remaining time left on the hotPotato\ntime must be between 1 and 10");
					int guess = key.nextInt();
					if(guess < p.getTime()) {
						System.out.println("You are safe for now");
						p.timeRemain(guess);
					}
					else {
						System.out.println("Your guess is too high\nyou are elminated");
						p.timeRemain(guess);
						ay.dequeue();
						System.out.println("Here are the winners");
						ay.showQueeu();
						System.out.println("Next round");
					}
				}
		}
	}
}

