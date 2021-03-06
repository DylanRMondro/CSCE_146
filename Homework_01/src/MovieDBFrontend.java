//Dylan Mondro
import java.util.Scanner;
public class MovieDBFrontend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		MovieDB movieData = new MovieDB();
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
			case 1:
				String aclear = key.nextLine();
				System.out.println("Enter the name of the movie");
				String aName = key.nextLine();
				System.out.println("Enter the name of the director");
				String aDirector = key.nextLine();
				System.out.println("Enter the year of the movie\nThe movie has to be 1888 or after");
				int aYear = key.nextInt();
				System.out.println("Enter the box office gross of the movie\nIt has to be bigger than 0");
				double aBoxOfficeGross = key.nextDouble();
				System.out.println("Enter the rating of the movie\nThe rating must be in between 1 and 5");
				int aRating = key.nextInt();
				Movie aMovie = new Movie(aName, aDirector, aYear, aBoxOfficeGross,aRating );
				movieData.addMovie(aMovie);
				break;
			case 2:
				aclear = key.nextLine();
				System.out.println("Enter the file name for the Movie DataBase");
				String nameAFileO = key.nextLine();
				movieData.printToFile(nameAFileO);
				break;
			case 3:
				aclear = key.nextLine();
				System.out.println("Enter the file name for the Movie DataBase");
				String nameAFileI = key.nextLine();
				movieData.readFromFile(nameAFileI);
				break;
			case 4:
				aclear = key.nextLine();
				movieData.printMovies();
				break;
			case 5:
				aclear = key.nextLine();
				System.out.println("Enter the name of the movie");
				aName = key.nextLine();
				System.out.println("Enter the director of the movie");
				aDirector = key.nextLine();
				System.out.println("Enter the year of the movie\nThe movie has to be 1888 or after");
				aYear = key.nextInt();
				System.out.println("Enter the box office gross of the movie\nIt has to be bigger than 0");
				aBoxOfficeGross = key.nextDouble();
				System.out.println("Enter the rating of the movie\nThe rating must be in between 1 and 5");
				aRating = key.nextInt();
				aMovie = new Movie(aName, aDirector, aYear, aBoxOfficeGross,aRating );
				movieData.removeMovie(aMovie);
			}
		}
	}

}
