
public class Movie {
	private String name, director;
	private int year, boxOfficeGross, rating;
	public Movie() {
		this.name = director = "none";
		this.year = 1888; //Year of the first movie
		this.boxOfficeGross = 0;
		this.rating = 1;
	}
	public Movie(String Aname, String aDirector, int aYear, int baBxOfficeGross, int aRating) {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year >= 1888)
			this.year = year;
		else
			this.year = 1888; //if later than 1888 then it will set it back to 1888
	}
	public int getBoxOfficeGross() {
		return boxOfficeGross;
	}
	public void setBoxOfficeGross(int boxOfficeGross) {
		if(boxOfficeGross > 0)
			this.boxOfficeGross = boxOfficeGross;
		else
			this.boxOfficeGross = 0;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		if(rating > 1 || rating < 5)
			this.rating = rating;
		else
			this.rating = 1;// if less than 1 it will set it back to 1
	}
	
}
