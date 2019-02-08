//Dylan Mondro
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
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
