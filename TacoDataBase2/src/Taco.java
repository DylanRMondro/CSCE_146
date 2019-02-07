//Notes
public class Taco {
	private String name, loc;
	private double price;
	private int rating;//1-5
	public Taco() { //default constructor
		this.name = this.loc = "none";
		this.price = 0.0;
		this.rating = 1;
	}
	public Taco(String aName, String aLoc, double aPrice, int aRating) {
		this.setName(aName);
		this.setLoc(aLoc);
		this.setPrice(aPrice);
		this.setRating(aRating);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price >= 0.0)
			this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		if(rating >=1 && rating <=5)
			this.rating = rating;
		else
			this.rating = 1;
	}
	public String toString() {
		return this.name + " " + this.loc + " " +this.price + " " + this.rating;
	}
	public boolean equals(Taco aTaco) {
		return aTaco != null &&
				this.name.equals(aTaco.getName()) &&
				this.loc.equals(aTaco.getLoc()) &&
				this.price == aTaco.getPrice() &&
				this.rating == aTaco.getRating();
	}
	public boolean equals(Object o) {//Overload
		return this.equals((Taco)o);//making o and Taco object
	}
	/*
	public static void main(String[] args) {
		Taco t = new Taco();
		
	}*/
	
	
}
