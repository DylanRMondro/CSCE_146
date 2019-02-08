//Dylan Mondro
import java.io.File;
import java.util.*;
public class MovieDB {
	private GenLinkedList<Movie> movie;
	public static final String DELM = "\t";
	public MovieDB() {
		movie = new GenLinkedList<Movie>();//WIll create a new instance of movie
	}
	public void addMovie(Movie aMovie) {//Will add a movie in the dataBase
		movie.insert(aMovie);
	}
	public void removeMovie(Movie aMovie) {//Will remove a movie from the dataBase
		movie.gotoItem(aMovie);
		movie.deleCurrent();
	}
	public void printMovies() {
		//TODO
	}
	public void printToFile() {
		//TODO
	}
	public void readFromFile(String fileName) {// will read from a file that we create
		try {
			Scanner fileScanner = new Scanner(new File(fileName));
			while(fileScanner.hasNextLine()) {
				String fileLine = fileScanner.nextLine();
				String[] splitLine = fileLine.split(DELM);
				if(splitLine.length != 4)
					continue;
				this.addMovie(new Movie(splitLine[0], splitLine[1], Double.parseDouble(splitLine[2]), Integer.parseInt(splitLine[3]));
			}
			fileScanner.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
