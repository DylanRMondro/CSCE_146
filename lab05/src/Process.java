//Dylan Mondro
public class Process {
	private String name;
	private double completionTime;
	
	public Process() {
		name = "No name";
		completionTime = 0.0;
	}
	public Process(String aName, double aCompletionTime) {
		name = aName;
		completionTime = aCompletionTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCompletionTime() {
		return completionTime;
	}
	public void setCompletionTime(double completionTime) {
		if(completionTime <= 0) {
			this.completionTime = completionTime;
		}
	}
	
	public String toString() {
		return this.name +" "+this.completionTime;
	}
}
