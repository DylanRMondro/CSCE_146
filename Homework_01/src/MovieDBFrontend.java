//Dylan Mondro
import java.util.Scanner;
public class MovieDBFrontend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		Movie movie = new Movie();
		System.out.println("Welcome to Dylan's Movie DataBase!");
		int stop = 1; //1= on 0= off
		int input = 0; //if the user just hits enter, it will exit the program
		while(stop == 1) {
			System.out.println("What would you like to do?\n"
					+ "1: add a Movie to the dataBase\n"
					+ "2: write to a Movie file\n"
					+ "3: read from that Movie file\n"
					+ "4: print the MOvie file\n"
					+ "5: delete a Movie from the dataBase\n"
					+ "0: quit from the program");
			input = key.nextInt();
			switch(input) {
			case 0:
				stop = 0;
				break;
			}
		}
	}

}
