//Dylan Mondro
import java.io.*;
import java.util.*;
public class MovieDB {
	private GenLinkedList<Movie> movie;
	public static final String DELM = "\t";
	GenLinkedList genLL = new GenLinkedList();
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
		genLL.print();
	}
	public void printToFile(String fileName, Movie[] movie) {
		try {
			PrintWriter fileWriter = new PrintWriter(
					new FileOutputStream(fileName));
			for(Movie m : movie) {
				fileWriter.println(m.getName()+DELM+
						m.getDirector()+DELM+
						m.getYear()+DELM+
						m.getRating()+DELM+
						m.getBoxOfficeGross());
			}
			fileWriter.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void readFromFile(String fileName, String[] movie) {
		try {
			Scanner sc = new Scanner(new File(fileName));
			for(int i=0; sc.hasNextLine(); i++) {
				if(!sc.hasNextLine())
					break;
				else if(sc.hasNextLine())
					movie[i] = sc.nextLine();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
