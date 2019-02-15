//Dylan
public class Potato {
	private int time;
	public Potato() {
		this.time = 0;
	}
	public Potato(int aTime) {
		this.time = aTime;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		if(time>= 0)
			this.time = time;
		else{
		}
	}
	public void timeRemain(int aTime) {
		if((aTime >= 1) && (aTime <=10))
			this.time = this.time - aTime; // will subtract the amount of time the player wish to hold the potato
		else {
			this.time = this.time - 10; //will subtract 10 if the time is incorrect
			System.out.println("We will assume you meant 10 seconds");
		}
	}
	public boolean badPotato() {
		if(time <= 0) {
			return false;
		}
		else {
			return true;
		}
	}
}

