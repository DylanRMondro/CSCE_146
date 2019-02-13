//Dylan Mondro
public class Player {
	private String name;//Name of player
	private Boolean inTheGame; //quick check for players
	public Player() {
		this.name = "It's a me";
		this.inTheGame = true;
	}
	public Player(String aName, Boolean aInTheGame) {
		this.name = aName;
		this.inTheGame = aInTheGame;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getInTheGame() {
		return inTheGame;
	}
	public void setInTheGame(Boolean inTheGame) {
		this.inTheGame = inTheGame;
	}
	public boolean stillInGame() { //the check to see if player are in the game
		if(name !=null && inTheGame ==true)
			return true;
		return false;
	}
}
