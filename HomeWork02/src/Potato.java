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
			this.time = 0;
		}
	}
	
}

